import com.bamboo.dao.IPhotoDAO;
import com.bamboo.entity.Photoes.Photo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

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

}
