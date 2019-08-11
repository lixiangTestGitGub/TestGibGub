/**
 * @description 切面
 * @author Administrator
 * @create 2019-5-20
 * @since 1.0.0
 */
package com.bdqn.t28AOPAnnotation;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created by Administrator on 2019-5-20.
 * 可以使用@Order()注解指定切面的优先级值越，优先级越高
 */
@Aspect //声明这是一个切面
@Component
public class SpringSection {
    /**
     *定义一个方法，用于声明切入点表达式，一般不用再该方法添入其他代码
     * 使用 @Pointcut来声明切入点表达式
     * 后面的其他通知直接使用方法名来引用当前的切入点表达式
     */
    @Pointcut("execution(* com.bdqn.t28AOPAnnotation.ArithmeticCalculatorImpl.*(int,int))")
    public  void declertJoinPoinExpression(){}
    /**
     * 前置通知
     * 在方法执行之前执行的代码
     */
    @Before("declertJoinPoinExpression()")
    public  void  beforeMethod(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("前置通知"+name+"前置通知"+ Arrays.asList(args));
    }

    /**
     * 后置通知
     * 在方法执行之后执行的代码，无论改方法是否异常
     */
    @After("execution(* com.bdqn.t28AOPAnnotation.ArithmeticCalculatorImpl.*(int ,int ))")
    public  void  after(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        System.out.println("后置通知After  "+name);
    }

    /**
     * 在方法正常结束执行的代码
     * 返回通知是可以调用到返回值的
     */
    @AfterReturning(value="execution(* com.bdqn.t28AOPAnnotation.ArithmeticCalculatorImpl.*(int ,int ))",
    returning = "count")
    public  void afterReturning(JoinPoint joinPoint, Object count){
        System.out.println("返回通知：返回值为："+count);
    }
    /**
     * 异常通知
     * 在目标方法出现异常时执行的代码
     * 可以访问异常对象，且可以在出现指定异常时在执行通知代码
     */
    @AfterThrowing(value = "execution(* com.bdqn.t28AOPAnnotation.ArithmeticCalculatorImpl.*(int ,int ))",
    throwing = "ex")
    public void  yc(JoinPoint joinPoint,Exception ex){
        String name = joinPoint.getSignature().getName();
        System.out.println("方法"+name+"异常通知"+ex);
    }


    /**
     * 环绕通知了解 功能强大但不一定常用
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


