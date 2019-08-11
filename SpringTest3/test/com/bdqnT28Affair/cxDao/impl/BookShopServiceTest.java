/**
 * @description
 * @author Administrator
 * @create 2019-5-24
 * @since 1.0.0
 */
package com.bdqnT28Affair.cxDao.impl;


import com.bdqnT28Affair.cxService.BookShopService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2019-5-24.
 */
public class BookShopServiceTest {
    @Test
    public  void  show(){
        ApplicationContext ab = new ClassPathXmlApplicationContext("bean-Affairtest.xml");
        BookShopService bean = ab.getBean(BookShopService.class);
        bean.purchase("张三",1);
    }
}
