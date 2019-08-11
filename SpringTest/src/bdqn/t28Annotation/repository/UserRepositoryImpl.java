/**
 * @description 实现接口
 * @author Administrator
 * @create 2019-5-18
 * @since 1.0.0
 */
package bdqn.t28Annotation.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import  bdqn.t28Annotation.testObjent;

/**
 * Created by Administrator on 2019-5-18.
 */
 @Repository
public class UserRepositoryImpl implements UserRepository {

    @Override
    public void show() {
        System.out.println("UserRepositoryimpl");
    }
}
