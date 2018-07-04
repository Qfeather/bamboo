import com.bamboo.dao.ICollectionDAO;
import com.bamboo.service.impl.CollectionServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:ApplicationContext.xml","classpath:ApplicationContext-dataSource.xml"})
public class CollectionTest {

    @Resource(name="CollectDao")
    private ICollectionDAO dao;

    @Test
    public void findimg(){//查询对应收藏夹下图片
        List<String> strings=dao.findimg("2");
        System.out.println(strings);
}
    @Test
    public void del(){
        Map<String,String> map=new HashMap<String,String>();
        map.put("uno","1");
        map.put("pno","1");
        int i=dao.del(map);
        System.out.println(i);
    }
    @Test
    public void insert(){
        com.bamboo.entity.users.Collection  collection=new com.bamboo.entity.users.Collection();
        collection.setUno("2");
        collection.setPpno("1");
        collection.setCdate();
        int i=dao.insertnewphoto(collection);
    }

    @Resource(name="collectionservice")
    private CollectionServiceImpl service;
    @Test
    public void findall(){
        List<String> list=service.allphoto("2");
        System.out.println(list);
}




}
