import com.bamboo.dao.IPhotoDAO;
import com.bamboo.entity.Photoes.Photo;
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
public class PhotoTest {

    @Resource(name = "Photo")
    private IPhotoDAO dao;

    @Test
    public void newP(){
        Photo photo=new Photo();
        photo.setPno();
        photo.setPurl("asgjkda.jpg");
        photo.setPdes("qwefghjk");
        photo.setPdate();
        photo.getCollnum();
        photo.setUno("1");
        int i=dao.newPhoto(photo);
        System.out.println(i);
    }
    @Test
    public void del(){
        int i=dao.delphoto("1");
        System.out.println(i);
    }

    @Test
    public void dell(){
        Map<String,String> map=new HashMap<String,String>();
        map.put("uno","1");
        map.put("pno","2");
        int i=dao.del(map);
        System.out.println(i);
    }

    @Test
    public void search(){
        List<Photo> photos=dao.searchphoto("阿萨");
        for (Photo p : photos) {
            System.out.println(p.toString());
        }
    }

}
