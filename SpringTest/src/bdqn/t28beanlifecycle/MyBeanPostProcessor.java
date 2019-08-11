/**
 * @description bean后置处理
 * @author Administrator
 * @create 2019-5-17
 * @since 1.0.0
 */
package bdqn.t28beanlifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by Administrator on 2019-5-17.
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

    //初始化bena的时候执行
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("后置处理器"+o+","+s);
        //开发过滤
        if ("person".equals(s)){
            //0.......
        }
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("后置处理器"+o+","+s);
        person p =new person();
        p.setName("后置更改");
        return p;
    }
}
