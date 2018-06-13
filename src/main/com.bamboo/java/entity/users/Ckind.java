package entity.users;

public class Ckind {//收藏夹类
    private String ckindno;//收藏夹编号
    private String ckname;//收藏夹名字
    private String ckuser;//收藏夹所有人

    public String getCkindno() {
        return ckindno;
    }

    public void setCkindno(String ckindno) {
        this.ckindno = ckindno;
    }

    public String getCkname() {
        return ckname;
    }

    public void setCkname(String ckname) {
        this.ckname = ckname;
    }

    public String getCkuser() {
        return ckuser;
    }

    public void setCkuser(String ckuser) {
        this.ckuser = ckuser;
    }

    @Override
    public String toString() {
        return "Ckind{" +
                "ckindno='" + ckindno + '\'' +
                ", ckname='" + ckname + '\'' +
                ", ckuser='" + ckuser + '\'' +
                '}';
    }
}
