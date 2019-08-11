/**
 * @description 切面
 * @author Administrator
 * @create 2019-5-20
 * @since 1.0.0
 */
package t28AOPXML;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import java.util.Arrays;

/**
 * Created by Administrator on 2019-5-20.
 * 可以使用@Order()注解指定切面的优先级值越，优先级越高
 */

public class SpringSection {
    /**
     * 前置通知
     * 在方法执行之前执行的代码
     */
    public  void  beforeMethod(JoinPoint joinPoint){
        //拿到方法名字
        String name = joinPoint.getSignature().getName();
        //拿参数
        Object[] args = joinPoint.getArgs();
        System.out.println("前置通知"+name+"前置通知"+ Arrays.asList(args));
    }

    /**
     * 后置通知
     * 在方法执行之后执行的代码，无论改方法是否异常
     */
    public  void  after(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        System.out.println("后置通知After  "+name);
    }

    /**
     * 在方法正常结束执行的代码
     * 返回通知是可以调用到返回值的
     */
    public  void afterReturning(JoinPoint joinPoint, Object count){
        System.out.println("返回通知：返回值为："+count);
    }
    /**
     * 异常通知
     * 在目标方法出现异常时执行的代码
     * 可以访问异常对象，且可以在出现指定异常时在执行通知代码
     */
    public void  yc(JoinPoint joinPoint,Exception ex){
        String name = joinPoint.getSignature().getName();
        System.out.println("方法"+name+"异常通知"+ex);
    }


    /**
     * 环绕通知了解 功能强大单不一定常用
     */
//    @Around("execution(* com.bdqn.t28AOPXML.ArithmeticCalculatorImpl.*(int ,int ))")
//    public  Object around(ProceedingJoinPoint joinPoint){
//        Object count = null;
//        String name = joinPoint.getSignature().getName();
//        Object[] args = joinPoint.getArgs();
//
//        try {
//            //前置通知
//            System.out.println("前置通知方法名："+name+"参数:"+Arrays.asList(args));
//            //执行目标方法
//            count = joinPoint.proceed();
//            //返回通知
//            System.out.println("方法返回"+count);
//        } catch (Throwable throwable) {
//            System.out.println("异常通知"+throwable);
//            throwable.printStackTrace();
//        } finally {
//            //后置通知
//            System.out.println("后置通知");
//        }
//        return  count;
//    }

}


