package com.bamboo.entity.comments;

import java.util.Date;

public class Comment {//评论类
    private String scno;//子评论编号
    private String fcno;//父评论编号
    private String content;//评论内容
    private String uno;//评论人
    private Date cdate;//评论时间（排序用）

    public String getScno() {
        return scno;
    }

    public void setScno(String scno) {
        this.scno = scno;
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

    public String getUno() {
        return uno;
    }

    public void setUno(String uno) {
        this.uno = uno;
    }

    public Date getCdate() {
        return cdate;
    }

    public void setCdate(Date cdate) {
        this.cdate = cdate;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "scno='" + scno + '\'' +
                ", fcno='" + fcno + '\'' +
                ", content='" + content + '\'' +
                ", uno='" + uno + '\'' +
                ", cdate=" + cdate +
                '}';
    }
}
