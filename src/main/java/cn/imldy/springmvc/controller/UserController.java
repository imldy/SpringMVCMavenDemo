package cn.imldy.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author imldy
 * @date 2021/11/07 10:55
 **/
@Controller
public class UserController {
    @RequestMapping("/selectUser")
    public String selectUser(HttpServletRequest request){
        String id = request.getParameter("id");
        System.out.println("id = " + id);
        return "sucess";
    }

    @RequestMapping("/selectUser2")
    public String selectUser2(Integer id) {
        System.out.println("id = " + id);
        return "sucess";
    }
}
