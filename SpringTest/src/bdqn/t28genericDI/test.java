/**
 * @description 测试依赖注入
 * @author Administrator
 * @create 2019-5-19
 * @since 1.0.0
 */
package bdqn.t28genericDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2019-5-19.
 */
public class test {
    public static void main(String[] args) {
        /**
         * 从结果看，虽然子类没有建立依赖关系，但userRepository实例还是被实例化了，
         * 就证明了父类的依赖关系，子类是可以继承的
         其实这里也可以说明，就算父类不是被IOC容器管理，但是建立关系时添加了@Autowired注解，
         父类的关系会被继承下来
         */
        ApplicationContext cxc = new ClassPathXmlApplicationContext("bean-di-xml.xml");
        UserService userService = (UserService) cxc.getBean("userService");
        userService.add();
    }
}
