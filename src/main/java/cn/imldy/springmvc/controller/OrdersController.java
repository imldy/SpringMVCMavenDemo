package cn.imldy.springmvc.controller;

import cn.imldy.springmvc.po.Orders;
import cn.imldy.springmvc.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author imldy
 * @date 2021/11/07 19:03
 **/
@Controller
public class OrdersController {
    /**
     * 向订单查询页面跳转
     *
     * @return 订单查询页面
     */
    @RequestMapping("/tofindOrdersWithUser")
    public String tofindOrdersWithUser() {
        return "orders";
    }

    @RequestMapping("/findOrdersWithUser")
    public String findOrdersWithUser(Orders orders) {
        Integer ordersId = orders.getOrdersId();
        User user = orders.getUser();
        String username = user.getUsername();
        System.out.println("ordersId = " + ordersId);
        System.out.println("username = " + username);
        return "sucess";
    }


}
