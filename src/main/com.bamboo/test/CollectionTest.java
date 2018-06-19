import com.bamboo.dao.ICollectionDAO;
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
public class CollectionTest {

    @Resource(name="CollectDao")
    private ICollectionDAO dao;

    @Test
    public void findckname(){//查询哪些收藏夹属于那些用户
        List<String> strings=dao.findckname("1");
        System.out.println(strings);
    }
    @Test
    public void findimg(){//查询对应收藏夹下图片
        Map<String,String> map=new HashMap<String,String>();
        map.put("uno","1");
        map.put("ckname","1");
        List<String> strings=dao.findimg(map);
        System.out.println(strings);
    }



}
