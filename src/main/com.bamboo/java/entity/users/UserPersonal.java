package entity.users;

public class UserPersonal {//用户个人标签
    private String uno;//用户编号
    private String lno;//标签编号
    private int number;//用户发布的图片带有此标签的数目

    public String getUno() {
        return uno;
    }

    public void setUno(String uno) {
        this.uno = uno;
    }

    public String getLno() {
        return lno;
    }

    public void setLno(String lno) {
        this.lno = lno;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "UserPersonal{" +
                "uno='" + uno + '\'' +
                ", lno='" + lno + '\'' +
                ", number=" + number +
                '}';
    }
}
