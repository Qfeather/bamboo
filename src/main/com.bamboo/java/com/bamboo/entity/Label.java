package com.bamboo.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Label {//标签类
    private String lno;//标签编号
    private String lname;//标签名

    public String getLno() {
        return lno;
    }

    public void setLno(String lno) {
        Date day=new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s=df.format(day).replaceAll("[[\\s-:punct:]]","");
        this.lno = "l"+s;
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
