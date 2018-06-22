import com.bamboo.dao.ILeaveMessageDAO;
import com.bamboo.dao.IPhotoLabelDAO;
import com.bamboo.entity.Photoes.Photo;
import com.bamboo.entity.comments.Comment;
import com.bamboo.entity.comments.Lmessage;
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
public class IPLabelTest {
    @Resource(name = "IPLDao")
    private IPhotoLabelDAO pdao;
    @Test
    public void insert(){
        Map<String,String> map=new HashMap<String,String>();
        map.put("pno","2");
        map.put("lno","b");
        int i=pdao.insertpl(map);
        System.out.println(i);
    }

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
    @Test
    public void inserrt(){
        Lmessage lmessage=new Lmessage();
        lmessage.setLmno();
        lmessage.setPhno("1");
        lmessage.setLmcontent("我觉得海星");
        lmessage.setUuno("1");
        lmessage.setLmdate();
        int i=dao.leavemessage(lmessage);
        System.out.println(i);
    }

    @Test
    public void comm(){
        Comment comment=new Comment();
        comment.setScno();
        comment.setFcno("5");
        comment.setContent("Test");
        comment.setUuno("1");
        comment.setCdate();
        comment.setLlmno("1");
        int i=dao.newcontent(comment);
        System.out.println(i);
    }

}
