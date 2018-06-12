package entity;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class DButils {
    Connection connection=null;
    //获取一个连接对象，可以新建一个方法，也可以写早构造函数里
    public Connection  getConn(){//可以写成单例
        if (connection == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                String url="jdbc:mysql://localhost:3306/java?useUnicode=true&characterEncoding=UTF-8";
                connection= DriverManager.getConnection(url,"root","root");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
    //关闭数据库的操作对象
    public void closeAll(PreparedStatement ps, Connection con, ResultSet rs){
        if(rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(ps!=null){
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(con!=null){
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
    //写一个通用的新增删除修改的方法
    public int excuteUpd(String sql, Object[] params){//传入sql语句和存放任意的数组
        PreparedStatement ps=null;
        int result=0;
        //sql="insert into student(Sno,Sname) values(?,?)";
        //        //        //ps.setString(1,007);
        //        //        //ps.setString(2,009);
        connection=getConn();
        try {
            ps=connection.prepareStatement(sql);
            //            Object[] input= {"1","007"};  Object类似于这个
            if(ps!=null){
                for(int i=0;i<params.length;i++){//？两个设定的数组长度也为2
                    ps.setObject(i+1,params[i]);//根据？顺序依次进行替换，从1开始
                }
            }
            result=ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public ResultSet find(String sql,Map<String,String> map){//通用查询
        PreparedStatement ps=null;
        connection=getConn();
        ResultSet rs=null;
        String condition=map.get("condition");
        String value=map.get("value");
//        System.out.println(condition + "  " + value);
//        StringBuffer sb=new StringBuffer(sql);
        try {
            if(condition.equals("")){
                //全查
                ps = connection.prepareStatement(sql);
            }else if(condition != null){
                sql=sql+" and "+condition+" like ?";
                //sql=sb.append(" and "+condition+" like ?").toString();
//                System.out.println(sql);
                ps = connection.prepareStatement(sql);
                ps.setObject(1,"%"+value+"%");
            }
            rs=ps.executeQuery();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        //4.执行查询,返回结果集对象
        return rs;
    }
//    public List<Student> findAll(){
//        PreparedStatement ps=null;
//        connection=getConn();
//        ResultSet rs=null;
//        String sql="select * from student";
//        List<Student> students=new LinkedList<>();
//        Student[] students1=new Student[100];
//        // Student student=new Student();
//
//        try {
//            ps = connection.prepareStatement(sql);
//            rs=ps.executeQuery();
//            int i=0;
//            while (rs.next()){
//                //将查询结果赋值给student
//                students1[i]=new Student();
//                students1[i].setSno(rs.getString(1));
//                students1[i].setSname(rs.getString(2));
//                students1[i].setAge(rs.getInt(3));
//                students1[i].setSex(rs.getString(4));
//                students1[i].setSd(rs.getString(5));
//                //student赋给student列表
//                students.add(i,students1[i]);
//                i++;
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return students;
//    }
}

