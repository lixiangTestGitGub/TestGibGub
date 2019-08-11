/**
 * @description 测试接口下面的第二个实现
 * @author Administrator
 * @create 2019-5-19
 * @since 1.0.0
 */
package bdqn.t28Annotation.repository;

import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2019-5-19.
 */
@Repository
public class UserTest implements UserRepository {
    @Override
    public void show() {
        System.out.println("测试容器下有两个bean");
    }
}
