package cn.imldy.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
    @RequestMapping(value = "/firstController2")
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest,
                                      HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        // 向ModelAndView添加一个名为msg的字符串对象
        modelAndView.addObject("msg","我的第一个 Spring MVC 程序 2 ——李德银");
        // 设置返回的试图路径名为某jsp文件，请求会被转发到此jsp页面
        modelAndView.setViewName("/WEB-INF/views/first.jsp");
        return modelAndView;
    }
}
