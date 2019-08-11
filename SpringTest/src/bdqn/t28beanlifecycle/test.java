/**
 * @description 测试生命周期
 * @author Administrator
 * @create 2019-5-17
 * @since 1.0.0
 */
package bdqn.t28beanlifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2019-5-17.
 */
public class test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean-lifecycle.xml");
        person person =(person) ctx.getBean("shengmingzhouqi");
        System.out.println(person);
        //关闭ioc容器
        ctx.close();
    }
}
