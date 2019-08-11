/**
 * @description bean之间的关系
 * @author Administrator
 * @create 2019-5-17
 * @since 1.0.0
 */
package bdqn.t28relation;

import bdqn.t28autowire.car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2019-5-17.
 */
public class relation {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-relation.xml");
        Object address1 = applicationContext.getBean("address1");
        System.out.println(address1);

        Object yilai = applicationContext.getBean("yilai");
        System.out.println(yilai);

        System.out.println("作用域测试");
        car    carscope = (car) applicationContext.getBean("carscope");
        car carscope1 = (car)applicationContext.getBean("carscope");
        System.out.println(carscope==carscope1);


    }

}
