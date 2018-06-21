import com.bamboo.dao.IFansDAO;
import com.bamboo.entity.users.Fans;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    @Test
    public void insett(){//关注
        Map<String,String> map=new HashMap<String,String>();
        map.put("user","4");//要关注的人
        map.put("fans","5");//你自己
        int i=dao.insertatten(map);
        System.out.println(i);
    }


    @Test
    public void del(){//取关
        Map<String,String> map=new HashMap<String,String>();
        map.put("users","4");//你要关注的人
        map.put("fans","5");//你自己
        int i=dao.delattention(map);//取关
        System.out.println(i);
    }
}
