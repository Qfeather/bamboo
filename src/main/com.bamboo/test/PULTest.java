import com.bamboo.dao.PLUDAO;
import com.bamboo.entity.users.UserPersonalLike;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:ApplicationContext.xml")
public class PULTest {

    @Resource(name = "plu")
    private PLUDAO dao;

    @Test
    public void selectlike(){
        List<String> likes=dao.selectlike("1");
        for (String like:likes) {
            System.out.println(like);
        }
    }

    @Test
    public void selectpersonal(){
        List<String> likes=dao.selectpersonal("1");
        for (String like:likes) {
            System.out.println(like);
        }
    }

    @Test
    public void insertlike(){
        UserPersonalLike like=new UserPersonalLike();
        like.setUno("1");
        like.setLno("8");
        like.setNumber();
        int i=dao.insertlike(like);
        System.out.println(i);
    }

    @Test
    public void insertpersonal(){
        UserPersonalLike like=new UserPersonalLike();
        like.setUno("1");
        like.setLno("8");
        like.setNumber();
        int i=dao.insertpersonal(like);
        System.out.println(i);
    }
}
