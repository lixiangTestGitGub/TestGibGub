/**
 * @description
 * @author Administrator
 * @create 2019-5-18
 * @since 1.0.0
 */
package bdqn.t28Annotation.service;

import bdqn.t28Annotation.controller.UserController;
import bdqn.t28Annotation.repository.UserRepository;
import bdqn.t28Annotation.repository.UserRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.annotation.Resources;

/**
 * Created by Administrator on 2019-5-18.
 */
@Service
public class UserService {
    @Autowired
    @Qualifier("userTest")
//    @Resource(name = "userTest")
    private  UserRepository userRepository;
    public  void  show(){
        System.out.println("UserService");
        userRepository.show();
    }

}
