package com.bamboo.entity.comments;

import com.bamboo.entity.Photoes.Photo;
import com.bamboo.entity.users.User;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Lmessage {//留言类
    private String lmno;//留言编号
//    private String pno;//被留言图片编号
    private String lmcontent;//留言内容
//    private String uno;//留言人
    private Date lmdate;//留言时间（排序用）

    private User uno;//

    private Photo pno;//对应照片

    public String getLmno() {
        return lmno;
    }

    public void setLmno() {
        Date day=new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s=df.format(day).replaceAll("[[\\s-:punct:]]","");
        this.lmno = "lm"+s;
    }

    public void setLmno(String lmno) {
        this.lmno = lmno;
    }

//    public String getPno() {
//        return pno;
//    }
//
//    public void setPno(String pno) {
//        this.pno = pno;
//    }

    public String getLmcontent() {
        return lmcontent;
    }

    public void setLmcontent(String lmcontent) {
        this.lmcontent = lmcontent;
    }

    public User getUno() {
        return uno;
    }

    public void setUno(User uno) {
        this.uno = uno;
    }

    public Photo getPno() {
        return pno;
    }

    public void setPno(Photo pno) {
        this.pno = pno;
    }

    public Date getLmdate() {
        return lmdate;
    }

    public void setLmdate(Date lmdate) {
        this.lmdate = lmdate;
    }
    public void setLmdate() {
        Date day=new java.sql.Date(new Date().getTime());
        this.lmdate = day;
    }

    @Override
    public String toString() {
        return "Lmessage{" +
                "lmno='" + lmno + '\'' +
                ", lmcontent='" + lmcontent + '\'' +
                ", lmdate=" + lmdate +
                ", uno=" + uno +
                ", pno=" + pno +
                '}';
    }
}
