package cn.imldy.springmvc.po;

/**
 * @author imldy
 * @date 2021/11/07 16:49
 **/
public class User {
    private Integer id;
    private String username;
    private String password; // 课本演示是Integer，实测用其作为参数变量，Spring提示400。String正常

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
