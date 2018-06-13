package entity.comments;

import java.util.Date;

public class Lmessage {//留言类
    private String lmno;//留言编号
    private String pno;//被留言图片编号
    private String lmcontent;//留言内容
    private String uno;//留言人
    private Date lmdate;//留言时间（排序用）

    public String getLmno() {
        return lmno;
    }

    public void setLmno(String lmno) {
        this.lmno = lmno;
    }

    public String getPno() {
        return pno;
    }

    public void setPno(String pno) {
        this.pno = pno;
    }

    public String getLmcontent() {
        return lmcontent;
    }

    public void setLmcontent(String lmcontent) {
        this.lmcontent = lmcontent;
    }

    public String getUno() {
        return uno;
    }

    public void setUno(String uno) {
        this.uno = uno;
    }

    public Date getLmdate() {
        return lmdate;
    }

    public void setLmdate(Date lmdate) {
        this.lmdate = lmdate;
    }

    @Override
    public String toString() {
        return "Lmessage{" +
                "lmno='" + lmno + '\'' +
                ", pno='" + pno + '\'' +
                ", lmcontent='" + lmcontent + '\'' +
                ", uno='" + uno + '\'' +
                ", lmdate=" + lmdate +
                '}';
    }
}
