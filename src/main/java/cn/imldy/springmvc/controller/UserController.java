package cn.imldy.springmvc.controller;

import cn.imldy.springmvc.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * @author imldy
 * @date 2021/11/07 10:55
 **/
@Controller
public class UserController {
    @RequestMapping("/selectUser")
    public String selectUser(HttpServletRequest request) {
        String id = request.getParameter("id");
        System.out.println("id = " + id);
        return "sucess";
    }

    @RequestMapping("/selectUser2")
    public String selectUser2(Integer id) {
        System.out.println("id = " + id);
        return "sucess";
    }

    @RequestMapping("/selectUser3")
    public String selectUser3(@RequestParam(value = "user_id", required = false) Integer id) {
        // @RequestParam 对请求中的参数进行定义
        //      value 注解的默认属性名，name属性的别名，入参的请求参数名称
        //      name 请求头绑定的名称
        //      required 请求中是否必须要有value指定的参数
        //      defaultValue 参数默认值
        System.out.println("(user_id) id = " + id);
        return "sucess";
    }

    /**
     * 向用户注册页面跳转
     *
     * @return
     */
    @RequestMapping("/toRegister")
    public String toRegister() {
        return "register";
    }

    /**
     * 接受用户注册信息
     */
    @RequestMapping("/registerUser")
    public String registerUser(User user) {
        String username = user.getUsername();
        String password = user.getPassword();
        System.out.println("用户名 username = " + username);
        System.out.println("密码 password = " + password);
        return "sucess"; //单词写错，将错就错
    }
}
