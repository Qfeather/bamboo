import com.bamboo.dao.ILeaveMessageDAO;
import com.bamboo.entity.Photoes.Photo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:ApplicationContext.xml")
public class IPLabelTest {
//    @Resource(name = "IPLDao")
//    private IPhotoLabelDAO dao;
//
//    @Test
//    public void selectPL(){
//        List<String> strings=dao.plabel("1");
//        System.out.println(strings);
//    }
//    @Test
//    public void selectLP(){
//        List<String> strings=dao.labelp("a");
//        System.out.println(strings);
//    }


    @Resource(name="LMessageDao")
    private ILeaveMessageDAO dao;

    @Test
    public void selectContext(){
        List<Photo> photos=dao.pcontent("1");
        for (Photo p :photos) {
            System.out.println(p.toString());
        }
    }

    @Test
    public void findALL(){
        List<Photo> photos=dao.findALL("1");
        for (Photo p :photos) {
            System.out.println(p.toString());
        }
    }
}
