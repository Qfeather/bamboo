package com.bamboo.entity.Photoes;

import com.bamboo.entity.comments.Lmessage;
import com.bamboo.entity.users.Collection;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Photo {//照片类
    private String pno;//照片编号
    private String uno;//上传用户编号
    private String purl;//照片路径
    private String pdes;//照片描述
    private Date pdate;//照片上传时间
    private int collnum;//收藏数

    private List<PhotoLabel> lno;//标签

    private List<Lmessage> lmno;//留言

    private Collection cno;//收藏夹

    public String getPno() {
        return pno;
    }

    public void setPno() {
        Date day=new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s=df.format(day).replaceAll("[[\\s-:punct:]]","");
        this.pno = "p"+s;
    }

    public String getUno() {
        return uno;
    }

    public void setUno(String uno) {
        this.uno = uno;
    }

    public String getPurl() {
        return purl;
    }

    public void setPurl(String purl) {
        this.purl = purl;
    }

    public String getPdes() {
        return pdes;
    }

    public void setPdes(String pdes) {
        this.pdes = pdes;
    }

    public Date getPdate() {
        return pdate;
    }

    public void setPdate() {
        Date day=new java.sql.Date(new Date().getTime());
        this.pdate = day;
    }

    public int getCollnum() {
        return collnum;
    }

    public void setCollnum(int collnum) {
        this.collnum = collnum;
    }

    public void setCollnum() {
        this.collnum = 0;
    }
    public void addCollnum() {
        this.collnum = this.collnum+1;
    }

    public List<PhotoLabel> getLno() {
        return lno;
    }

    public void setLno(List<PhotoLabel> lno) {
        this.lno = lno;
    }

    public List<Lmessage> getLmno() {
        return lmno;
    }

    public void setLmno(List<Lmessage> lmno) {
        this.lmno = lmno;
    }

    public Collection getCno() {
        return cno;
    }

    public void setCno(Collection cno) {
        this.cno = cno;
    }

    @Override
    public String toString() {
        return "\nPhoto{" +
                "pno='" + pno + '\'' +
                ", uno='" + uno + '\'' +
                ", purl='" + purl + '\'' +
                ", pdes='" + pdes + '\'' +
                ", pdate=" + pdate +
                ", collnum=" + collnum +
                ", lno=" + lno +
                ", lmno=" + lmno +
                ", cno=" + cno +
                '}'+"\n";
    }
}


