package cn.imldy.springmvc.controller;

import cn.imldy.springmvc.po.User;
import cn.imldy.springmvc.vo.UserVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

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

    /**
     * 向用户列表跳转
     */
    @RequestMapping("/toUser")
    public String selectUsers() {
        return "user";
    }

    /**
     * 接收批量删除用户的方法
     */
    @RequestMapping("/deleteUsers")
    public String deleteUsers(Integer[] ids) {
        if (ids != null) {
            for (Integer id : ids) {
                System.out.println("删除了id为" + id + "的用户");
            }
        } else {
            System.out.println("ids=null");
        }
        return "sucess";
    }

    /**
     * 向用户批量修改页面跳转
     */
    @RequestMapping("/toUserEdit")
    public String toUserEdit() {
        return "user_edit";
    }

    /**
     * 接收批量修改用户的方法
     */
    @RequestMapping("/editUsers")
    public String editUsers(UserVO userList) {
        List<User> users = userList.getUsers();
        for (User user : users) {
            // 如果user.id不为空，则代表对该user进行了修改。为空则代表未修改
            if (user.getId() != null) {
                System.out.println("修改了id为" + user.getId() + "，名为" + user.getUsername() + "的用户");
            }
        }
        return "sucess";
    }

    @RequestMapping("/testJson")
    @ResponseBody
    public User testJson(@RequestBody User user) {
        System.out.println("user = " + user);
        return user;
    }

}
