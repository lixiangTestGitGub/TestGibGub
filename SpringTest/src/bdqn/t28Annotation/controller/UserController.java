/**
 * @description
 * @author Administrator
 * @create 2019-5-18
 * @since 1.0.0
 */
package bdqn.t28Annotation.controller;

import bdqn.t28Annotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by Administrator on 2019-5-18.
 */

public class UserController {
    @Autowired
    private  UserService userService;
    public void  show(){
        System.out.println("UserController");
        userService.show();
    }
}
