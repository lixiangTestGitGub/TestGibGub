/**
 * @description
 * @author Administrator
 * @create 2019-5-17
 * @since 1.0.0
 */
package bdqn.t28Datasources;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2019-5-17.
 */
public class DataSource {

    public static void main(String[] args) {
        ApplicationContext abc = new ClassPathXmlApplicationContext("bean-DataSource.xml");
        Object dataSource = abc.getBean("dataSource1");
        System.out.println(dataSource);
        Object dataSource1 = abc.getBean("dataSource");
        System.out.println(dataSource1);
    }

}
