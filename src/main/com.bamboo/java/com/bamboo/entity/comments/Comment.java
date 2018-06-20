package com.bamboo.entity.comments;

import com.bamboo.entity.users.User;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Comment {//评论类
    private String scno;//子评论编号
    private String fcno;//父评论编号//根据父评论编号找到评论人//回复的格式为   回复+@+父评论评论人+评论内容
    private String content;//评论内容
    private User uno;//评论人
    private Date cdate;//评论时间（排序用）


    private Lmessage lmessage;//位于哪个留言下


    public String getScno() {
        return scno;
    }

    public void setScno(String scno) {
        this.scno = scno;
    }
    public void setScno() {
        Date day=new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s=df.format(day).replaceAll("[[\\s-:punct:]]","");
        this.scno = "comm"+s;
    }

    public String getFcno() {
        return fcno;
    }

    public void setFcno(String fcno) {
        this.fcno = fcno;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getUno() {
        return uno;
    }

    public void setUno(User uno) {
        this.uno = uno;
    }

    public Lmessage getLmessage() {
        return lmessage;
    }

    public void setLmessage(Lmessage lmessage) {
        this.lmessage = lmessage;
    }

    public Date getCdate() {
        return cdate;
    }

    public void setCdate(Date cdate) {
        this.cdate = cdate;
    }
    public void setCdate() {
        Date day=new java.sql.Date(new Date().getTime());
        this.cdate = day;
    }

    @Override
    public String toString() {
        return "\nComment{" +
                "scno='" + scno + '\'' +
                ", fcno='" + fcno + '\'' +
                ", content='" + content + '\'' +
                ", uno='" + uno + '\'' +
                ", cdate=" + cdate +
                '}'+"\n";
    }
}
