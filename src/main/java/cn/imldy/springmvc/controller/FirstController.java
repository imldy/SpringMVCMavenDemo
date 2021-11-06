package cn.imldy.springmvc.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author imldy
 * @date 2021/11/06 21:08
 * 控制器类
 **/
public class FirstController implements Controller {

    // Controller接口的实现方法，此方法需要返回一个ModelAndView对象
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest,
                                      HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        // 向ModelAndView添加一个名为msg的字符串对象
        modelAndView.addObject("msg","我的第一个 Spring MVC 程序 ——李德银");
        // 设置返回的试图路径名为某jsp文件，请求会被转发到此jsp页面
        modelAndView.setViewName("/WEB-INF/views/first.jsp");
        return modelAndView;
    }
}
