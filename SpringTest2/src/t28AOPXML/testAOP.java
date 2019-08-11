/**
 * @description 测试aop
 * @author Administrator
 * @create 2019-5-21
 * @since 1.0.0
 */
package t28AOPXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2019-5-21.
 */
public class testAOP {
    public static void main(String[] args) {
        ApplicationContext cs = new ClassPathXmlApplicationContext("bean-AOP-Springxml.xml");
        ArithmeticCalculator as = (ArithmeticCalculator) cs.getBean("arithmeticCalculator");
        int add = as.add(1, 3);
        System.out.println(add);
        int div = as.div(10, 2);
        System.out.println(div);
    }
}
