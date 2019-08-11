/**
 * @description
 * @author Administrator
 * @create 2019-6-3
 * @since 1.0.0
 */

import com.zxhm.entity.affairDto;
import org.junit.Test;
import com.zxhm.dao.affair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by Administrator on 2019-6-3.
 */
public class test {

    @Autowired
    private  affair affair;

    @Test
    public  void  show(){
        ApplicationContext ax = new ClassPathXmlApplicationContext("spring/spring-applicecontext-dao.xml");
        Object affair = ax.getBean("affair");
        System.out.println(affair);
    }
}
