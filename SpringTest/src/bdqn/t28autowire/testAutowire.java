/**
 * @description 测试自动装配
 * @author Administrator
 * @create 2019-5-17
 * @since 1.0.0
 */
package bdqn.t28autowire;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2019-5-17.
 */
public class testAutowire {
    public static void main(String[] args) {
         //创建ioc容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-autowire.xml");
        person person = (person)applicationContext.getBean("person");
        System.out.println(person);
    }
}
