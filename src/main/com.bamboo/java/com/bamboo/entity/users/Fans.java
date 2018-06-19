package com.bamboo.entity.users;

public class Fans {//关注粉丝类
    private String users;//被关注人编号
    private String fans;//粉丝编号

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }

    public String getFans() {
        return fans;
    }

    public void setFans(String fans) {
        this.fans = fans;
    }

    @Override
    public String toString() {
        return "Fans{" +
                "users='" + users + '\'' +
                ", fans='" + fans + '\'' +
                '}';
    }
}
