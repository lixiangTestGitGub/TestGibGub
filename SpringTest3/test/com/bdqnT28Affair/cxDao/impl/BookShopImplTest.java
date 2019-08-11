package com.bdqnT28Affair.cxDao.impl;

import com.bdqnT28Affair.cxDao.BookShopDao;
import com.bdqnT28Affair.cxService.BookShopService;
import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2019-5-23.
 */
public class BookShopImplTest extends TestCase {

        public ApplicationContext ab = new ClassPathXmlApplicationContext("bean-Affairtest.xml");
        BookShopDao bean = ab.getBean(BookShopDao.class);

    @Test
    public void testFindBookPriceByIsbn() throws Exception {
        int bookPriceByIsbn = bean.findBookPriceByIsbn(1);
        System.out.println(bookPriceByIsbn);
    }
    @Test
    public void testUpdateBookStock() throws Exception {
        int i = bean.updateBookStock(1);
        System.out.println(i);
    }

    public void testUpdateUserAccount() throws Exception {
        bean.updateUserAccount("张三",100);
    }

}