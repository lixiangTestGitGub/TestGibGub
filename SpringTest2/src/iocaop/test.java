/**
 * @description
 * @author Administrator
 * @create 2019-5-29
 * @since 1.0.0
 */
package iocaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.config.ContextLifecycleScheduledTaskRegistrar;

/**
 * Created by Administrator on 2019-5-29.
 */
public class test {
    public static void main(String[] args) {
        ApplicationContext xx = new ClassPathXmlApplicationContext("bean-AOP-IOC.xml");
        abc abc =(abc) xx.getBean("pfb");
        abc.show();

    }
}
