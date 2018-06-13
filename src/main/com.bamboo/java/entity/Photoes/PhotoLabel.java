package entity.Photoes;

public class PhotoLabel {//照片标签类
    private String pno;//照片编号
    private String lno;//标签编号

    public String getPno() {
        return pno;
    }

    public void setPno(String pno) {
        this.pno = pno;
    }

    public String getLno() {
        return lno;
    }

    public void setLno(String lno) {
        this.lno = lno;
    }

    @Override
    public String   toString() {
        return "PhotoLabel{" +
                "pno='" + pno + '\'' +
                ", lno='" + lno + '\'' +
                '}';
    }
}
