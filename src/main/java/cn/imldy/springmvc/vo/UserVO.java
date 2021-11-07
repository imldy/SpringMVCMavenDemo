package cn.imldy.springmvc.vo;

import cn.imldy.springmvc.po.User;

import java.util.List;

/**
 * @author imldy
 * @date 2021/11/07 20:34
 * 用户包装类
 **/
public class UserVO {
    // 集合属性
    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
