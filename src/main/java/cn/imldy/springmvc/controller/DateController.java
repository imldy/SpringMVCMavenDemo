package cn.imldy.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * @author imldy
 * @date 2021/11/07 19:33
 * 日期控制类
 **/
@Controller
public class DateController {
    /**
     * 使用自定义类型数据绑定日期数据
     */
    @RequestMapping("/customDate")
    public String CustomDate(Date date) {
        // 使用自定义类型转换器，将url的date参数的字符串转换为date对象
        System.out.println("date = " + date);
        return "sucess";
    }
}
