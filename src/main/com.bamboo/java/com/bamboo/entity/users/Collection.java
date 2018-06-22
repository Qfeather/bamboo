package com.bamboo.entity.users;

import com.bamboo.entity.Photoes.Photo;

import java.util.Date;
import java.util.List;

public class Collection {//收藏类
    private String uno;//用户编号
    private String ppno;
    private List<Photo> pno;//照片编号
    private Date cdate;//收藏时间
    private String ckname;//收藏夹名字

    public String getUno() {
        return uno;
    }

    public void setUno(String uno) {
        this.uno = uno;
    }

    public List<Photo> getPno() {
        return pno;
    }

    public void setPno(List<Photo> pno) {
        this.pno = pno;
    }
    public void setPpno(String ppno) {
        this.ppno = ppno;
    }
    public Date getCdate() {
        return cdate;
    }

    public void setCdate() {
        Date day=new java.sql.Date(new Date().getTime());
        this.cdate = day;
    }


    public String getCkname() {
        return ckname;
    }

    public void setCkname(String ckname) {
        this.ckname = ckname;
    }

    @Override
    public String toString() {
        return "Collection{" +
                "uno='" + uno + '\'' +
                ", pno=" + pno +
                ", cdate=" + cdate +
                ", ckname='" + ckname + '\'' +
                '}';
    }
}
