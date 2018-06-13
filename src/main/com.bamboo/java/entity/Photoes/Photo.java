package entity.Photoes;

import java.util.Date;

public class Photo {//照片类
    private String pno;//照片编号
    private String purl;//照片路径
    private String pdes;//照片描述
    private Date pdate;//照片上传时间
    private String collnum;//收藏数

    public String getPno() {
        return pno;
    }

    public void setPno(String pno) {
        this.pno = pno;
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

    public void setPdate(Date pdate) {
        this.pdate = pdate;
    }

    public String getCollnum() {
        return collnum;
    }

    public void setCollnum(String collnum) {
        this.collnum = collnum;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "pno='" + pno + '\'' +
                ", purl='" + purl + '\'' +
                ", pdes='" + pdes + '\'' +
                ", pdate=" + pdate +
                ", collnum='" + collnum + '\'' +
                '}';
    }
}


