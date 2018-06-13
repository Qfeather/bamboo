package entity.users;

import java.util.Date;

public class Collection {//收藏类
    private String uno;//用户编号
    private String pno;//照片编号
    private String ckind;//收藏夹编号

    public String getUno() {
        return uno;
    }

    public void setUno(String uno) {
        this.uno = uno;
    }

    public String getPno() {
        return pno;
    }

    public void setPno(String pno) {
        this.pno = pno;
    }

    public String getCkind() {
        return ckind;
    }

    public void setCkind(String ckind) {
        this.ckind = ckind;
    }

    @Override
    public String toString() {
        return "Collection{" +
                "uno='" + uno + '\'' +
                ", pno='" + pno + '\'' +
                ", ckind='" + ckind + '\'' +
                '}';
    }
}
