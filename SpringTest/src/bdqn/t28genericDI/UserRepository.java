/**
 * @description 定义仓库服务层
 * @author Administrator
 * @create 2019-5-19
 * @since 1.0.0
 */
package bdqn.t28genericDI;

import org.springframework.stereotype.Repository;

/**
 * Demo class
 * @author 李湘
 * @date 2019-5-19
 */
@Repository
public class UserRepository extends  BeanRepository<user> {
      public  void  add(){
          System.out.println("子类方法");
      }
}
