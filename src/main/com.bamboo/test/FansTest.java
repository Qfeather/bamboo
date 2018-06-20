import com.bamboo.dao.IFansDAO;
import com.bamboo.entity.users.Fans;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:ApplicationContext.xml")
public class FansTest {

    @Resource(name = "fans")
    private IFansDAO dao;

    @Test
    public void findfans(){
        List<Fans> users=dao.selectfans("1");
        for (Fans u: users) {
            System.out.println(u.toString());
        }
    }
    @Test
    public void findatten(){
        List<Fans> users=dao.selectatten("1");
        for (Fans u: users) {
            System.out.println(u.toString());
        }
    }
}
