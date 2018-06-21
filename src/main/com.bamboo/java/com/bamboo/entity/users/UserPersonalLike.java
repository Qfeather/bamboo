package com.bamboo.entity.users;

public class UserPersonalLike {//用户喜爱的标签
    private String uno;//用户编号
    private String lno;//标签编号
    private int number;//查看带有此标签的图片的次数

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

    public void setNumber() {
        this.number = 0;
    }

    @Override
    public String toString() {
        return "UserPersonalLike{" +
                "uno='" + uno + '\'' +
                ", lno='" + lno + '\'' +
                ", number=" + number +
                '}';
    }
}
