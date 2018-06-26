package com.bamboo.entity.Photoes;

import java.util.List;

public class PhotoLabel {//照片标签类
    private List<Photo> pno;//照片编号
    private String lno;//标签编号


    public String getLno() {
        return lno;
    }

    public void setLno(String lno) {
        this.lno = lno;
    }

    public List<Photo> getPno() {
        return pno;
    }

    public void setPno(List<Photo> pno) {
        this.pno = pno;
    }

    @Override
    public String toString() {
        return "PhotoLabel{" +
                "pno=" + pno +
                ", lno='" + lno + '\'' +
                '}';
    }
}
