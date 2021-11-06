package cn.imldy.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author imldy
 * @date 2021/11/06 21:08
 * 控制器类
 **/
@Controller
@RequestMapping(value = "/p") // 此注解标注在类上，该类的所有方法都将映射为相对于类级别的请求
public class FirstControllerAnnoation {

    // 映射一个请求或一个方法，接收到对应的URL请求时被调用
    @GetMapping(value = "/firstController2")
    // @RequestMapping(value = "/firstController2", method = RequestMethod.GET)
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest,
                                      HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        // 向ModelAndView添加一个名为msg的字符串对象
        modelAndView.addObject("msg", "我的第一个 Spring MVC 程序 2 ——李德银");
        // 设置返回的试图路径名为某jsp文件，请求会被转发到此jsp页面
        modelAndView.setViewName("/WEB-INF/views/first.jsp");
        return modelAndView;
    }


    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public ModelAndView selectUserById(@PathVariable("id") String id) {
        // 如果没有@PathVariable("id")，则只会接收URL请求的query值
        System.out.println("id = " + id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/WEB-INF/views/sucess.jsp");
        return modelAndView;
    }

    @GetMapping(value = "/user2/{id}")
    public ModelAndView selectUserById2(@PathVariable("id") String id) {
        // 如果没有@PathVariable("id")，则只会接收URL请求的query值
        System.out.println("2 id = " + id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/WEB-INF/views/sucess.jsp");
        return modelAndView;
    }

}
