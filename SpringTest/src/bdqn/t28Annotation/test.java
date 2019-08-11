/**
 * @description
 * @author Administrator
 * @create 2019-5-18
 * @since 1.0.0
 */
package bdqn.t28Annotation;

import bdqn.t28Annotation.controller.UserController;
import bdqn.t28Annotation.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2019-5-18.
 */

public class test {
    public static void main(String[] args) {
        ApplicationContext appx = new ClassPathXmlApplicationContext("bean-annotation.xml");
//        Object testObjent = appx.getBean("testObjent");
//        System.out.println(testObjent);
//        Object userPepository = appx.getBean("userRepository");
//        System.out.println(userPepository);
        UserService userService = (UserService) appx.getBean("userService");
        System.out.println(userService);
        userService.show();
//        UserController  userController = (UserController) appx.getBean("UserService");
//        System.out.println(userController);
//        userController.show();
    }

}
