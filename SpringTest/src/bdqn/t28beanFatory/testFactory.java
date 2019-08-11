/**
 * @description 测试工厂
 * @author Administrator
 * @create 2019-5-18
 * @since 1.0.0
 */
package bdqn.t28beanFatory;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2019-5-18.
 */
public class testFactory {
    public static void main(String[] args) {
        ApplicationContext cx = new ClassPathXmlApplicationContext("bean-factory.xml");
        Object address1 = cx.getBean("address1");
        System.out.println(address1);
        Object address2 = cx.getBean("address2");
        System.out.println(address2);

        Object addressA = cx.getBean("addressA");
        System.out.println(addressA);
    }

}
