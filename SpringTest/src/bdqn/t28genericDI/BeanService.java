/**
 * @description 定义服务层
 * @author Administrator
 * @create 2019-5-19
 * @since 1.0.0
 */
package bdqn.t28genericDI;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Demo class
 * @author 李湘
 * @date 2019-5-19
 */
public class  BeanService<T> {
    /**
     *@Autowired 告诉ioc容器自动装配有依赖关系的bean
     *  protected BeanRepository<T> repository;
     */
    @Autowired
    protected BeanRepository<T> repository;


    public  void  add(){
        System.out.println("add");
        System.out.println(repository);
        repository.show();
    }
}
