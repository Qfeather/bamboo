import com.bamboo.dao.ILabelDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:ApplicationContext.xml")
public class LabelTest {

    @Resource(name="label")
    private ILabelDAO dao;

    @Test
    public void findLabel(){
        String s=dao.findLabel("人像");
        System.out.println(s);
    }

    @Test
    public void insert(){
        Map<String,String> map=new HashMap<String,String>();
        map.put("lno","7");
        map.put("lname","楼宇");
        int i=dao.insertLabel(map);
        System.out.println(i);
    }




}
