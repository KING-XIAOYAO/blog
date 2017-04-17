package cn.blog.model;

import java.io.Serializable;

/**
 * @Coder XIAOYAO
 * @Time 2016年4月21日 下午10:02:34
 * 用户表
 */
public class User implements Serializable {

    private static final long serialVersionUID = -7604823963551594806L;

    /**
     * 用户id
     */
    private int id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户姓名
     */
    private String xm;

    /**
     * 用户性别
     */
    private String sex;

    /**
     * 用户年龄
     */
    private String age;

    /**
     * 出生日期
     */
    private String birthday;

    /**
     * 家庭地址
     */
    private String address;

    /**
     * 邮件地址
     */
    private String email;

    /**
     * QQ号码
     */
    private String qq;

    /**
     * 主页
     */
    private String pagehome;

    /**
     * 用户等级
     */
    private String level;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getPagehome() {
        return pagehome;
    }

    public void setPagehome(String pagehome) {
        this.pagehome = pagehome;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
