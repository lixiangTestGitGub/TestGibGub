/**
 * @description
 * @author Administrator
 * @create 2019-5-29
 * @since 1.0.0
 */
package iocaop;


import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2019-5-29.
 */
public class Advice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("前置通知"+objects+"  "+o);
    }
}
