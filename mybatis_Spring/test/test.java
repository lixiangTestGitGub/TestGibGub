/**
 * @description
 * @author Administrator
 * @create 2019-5-26
 * @since 1.0.0
 */

import com.ssm.entity.studentDto;
import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import  com.ssm.Dao.student;

import java.util.List;

/**
 * Created by Administrator on 2019-5-26.
 */
public class test {
Logger logger= LoggerFactory.getLogger(test.class);

    @Test
    public  void show(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/bean-applicationContest.xml");
        student student = (student) applicationContext.getBean("student");
        List<studentDto> studentDtos = student.selectAll();
        for (studentDto ab:studentDtos){
           System.out.println(ab.getAddress());
       }
    }
}
