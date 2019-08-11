/**
 * @description
 * @author Administrator
 * @create 2019-5-29
 * @since 1.0.0
 */
package bdqn.t28beanlifecycle.nes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2019-5-29.
 */
public class test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext cx = new ClassPathXmlApplicationContext("bean-newlifecycle.xml");
        student student = (student)cx.getBean("student");
        System.out.println(student);
        cx.close();

    }
}
