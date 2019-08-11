/**
 * @description
 * @author Administrator
 * @create 2019-6-2
 * @since 1.0.0
 */

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ssm.Dao.student;
import ssm.entity.studentDto;

import java.util.List;

/**
 * Created by Administrator on 2019-6-2.
 */
public class test {

    @Test
    public  void  show(){
        ApplicationContext cx = new ClassPathXmlApplicationContext("Spring/bean-AppliceContest.xml");
        student student = (student) cx.getBean("student");
        List<studentDto> studentDtos = student.selectAll();
        System.out.println(studentDtos);
        for (studentDto abc: studentDtos){
            System.out.println(abc.getAddress());
        }
    }
}
