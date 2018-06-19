package com.bamboo.entity;

public class Label {//标签类
    private String lno;//标签编号
    private String lname;//标签名

    public String getLno() {
        return lno;
    }

    public void setLno(String lno) {
        this.lno = lno;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    @Override
    public String toString() {
        return "Label{" +
                "lno='" + lno + '\'' +
                ", lname='" + lname + '\'' +
                '}';
    }
}
