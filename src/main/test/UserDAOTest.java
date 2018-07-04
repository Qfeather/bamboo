import com.bamboo.dao.IUserDAO;
import com.bamboo.entity.users.User;
import com.bamboo.service.impl.UserServicesImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:ApplicationContext.xml","classpath:ApplicationContext-dataSource.xml"})
public class UserDAOTest {

    @Resource(name = "userdao")
    private IUserDAO dao;
    @Test
    public void finddddd(){
        User user=dao.findoneuser("admin");
        System.out.println(user.toString());
    }
    @Test
    public void findp(){//根据用户名找密码
       String user= dao.findByusername("root");
       System.out.println(user);
    }
    @Test
    public void find(){//查找除编号，密码之外的所有值
        User user=dao.findAll("root");
        System.out.println(user.toString());
    }
    @Test
    public  void finduno(){
        String uno=dao.getuno("root");
        System.out.println(uno);
    }
    @Test
    public  void findo(){
        User uno=dao.findOne("1");
        System.out.println(uno.toString());
    }
    @Test
    public void newU(){
        User user=new User();
        user.setUno();
        user.setUsername("389146016@qq.com");
        user.setPassword("123456");
        user.setName("test");
        user.setSex("男");
        user.setAge(12);
        user.setRegdate();
        user.setTel("12222223333");
        int i=dao.newUser(user);
        System.out.println(i);
    }

    @Test
    public void upd(){
        User user = new User();
        user.setUno("1");
        user.setPassword("123456");
        user.setName("test");
        user.setSex("男");
        user.setAge(12);
        user.setHomepages("qfeather.github.io");
        user.setProfile("这个人很懒什么都没写.jpg");
        user.setTel("12222223333");
        user.setHeadimg("123.jpg");

        int i=dao.upd(user);
        System.out.println(i);
    }



    @Test
    public void search(){
        List<User> users=dao.searchuser("元");
        for (User u : users) {
            System.out.println(u.toString());
        }
    }

    @Resource(name = "userservice")
    private UserServicesImpl service;
    @Test
    public void login(){

        if(service.login("admin","admin")){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    @Test
    public void test1(){
        User user=service.getUser("admin");
        System.out.println(user.toString());
    }

}
