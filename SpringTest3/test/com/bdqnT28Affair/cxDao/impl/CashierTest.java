/**
 * @description
 * @author Administrator
 * @create 2019-5-24
 * @since 1.0.0
 */
package com.bdqnT28Affair.cxDao.impl;

import com.bdqnT28Affair.cxService.Cashier;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2019-5-24.
 */
public class CashierTest {
    @Test
    public  void  show(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-Affairtest.xml");
        Cashier bean = applicationContext.getBean(Cashier.class);
        bean.checkout("张三",Arrays.asList(1,2));
    }
}
