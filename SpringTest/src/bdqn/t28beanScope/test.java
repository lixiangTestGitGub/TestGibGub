/**
 * @description 测试作用域
 * @author Administrator
 * @create 2019-5-17
 * @since 1.0.0
 */
package bdqn.t28beanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2019-5-17.
 */
public class test
{
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-scope.xml");
        Object scop = applicationContext.getBean("scope");
        Object scop1 = applicationContext.getBean("scope");
        System.out.println(scop==scop1);

    }
}
