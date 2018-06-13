package entity.users;

import java.util.Date;

public class User {//用户类
    private String uno;//用户编号
    private String username;//用户账号（邮箱）
    private String password;//用户密码
    private String name;//姓名
    private String sex;//性别
    private String age;//年龄
    private String homepages;//个人主页
    private String profile;//个人简介
    private String headimg;//头像
    private String tel;//电话
    private Date regdate;//注册时间

    public String getUno() {
        return uno;
    }

    public void setUno(String uno) {
        this.uno = uno;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getHomepages() {
        return homepages;
    }

    public void setHomepages(String homepages) {
        this.homepages = homepages;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getHeadimg() {
        return headimg;
    }

    public void setHeadimg(String headimg) {
        this.headimg = headimg;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Date getRegdate() {
        return regdate;
    }

    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }

    @Override
    public String toString() {
        return "User{" +
                "uno='" + uno + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                ", homepages='" + homepages + '\'' +
                ", profile='" + profile + '\'' +
                ", headimg='" + headimg + '\'' +
                ", tel='" + tel + '\'' +
                ", regdate=" + regdate +
                '}';
    }
}
