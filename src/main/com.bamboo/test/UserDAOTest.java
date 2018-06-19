import com.bamboo.dao.IUserDAO;
import com.bamboo.entity.users.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:ApplicationContext.xml")
public class UserDAOTest {

    @Resource(name = "UserDao")
    private IUserDAO dao;
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

}