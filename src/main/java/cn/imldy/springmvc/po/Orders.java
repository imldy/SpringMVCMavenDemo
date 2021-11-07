package cn.imldy.springmvc.po;

/**
 * @author imldy
 * @date 2021/11/07 19:01
 * 包装类，包含 User POJO
 **/
public class Orders {
    private Integer ordersId;
    private User user;

    public Integer getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(Integer ordersId) {
        this.ordersId = ordersId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
