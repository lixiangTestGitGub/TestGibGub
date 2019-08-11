/**
 * @description
 * @author Administrator
 * @create 2019-5-23
 * @since 1.0.0
 */
package com.bdqnT28Affair.cxService;

import com.bdqnT28Affair.cxDao.BookShopDao;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2019-5-23.
 */
@Service("bookShopService")
public class BookShopImpl implements BookShopService {

    @Autowired
    private  BookShopDao bookShopDao;

    /**
     *
     * @param username
     * @param isbn
     * 1.使用@Transactional 指定事务的传播行为，即当前方法被另一个事务的方法调用时
     * 如何使用事务，默认使用REQUIRES 当前方法的事务
     * Propagation.REQUIRES_NEW调用自己的事务，自己事务的方法被挂起。
     * 2.使用isolation = Isolation.READ_COMMITTED指定事务的隔离级别，默认情况下
     * spring的声明事务对所有的运行时异常进行回滚，也可以通过对应的属性进行设置回滚
     * 通常情况下默认值即可 noRollbackFor 对那些事务不进行回滚
     * 3.使用readOnly指定事务是否只读，表示这个事务只读取数据，但不更新数据，这样可以帮
     * 数据库引擎优化事务，若真的只有一个只读属性值的方法，应设置readOnly = true
     * 4.使用timeout指定强制回滚前事务可占用时间
     *
     */
    @Transactional(propagation = Propagation.REQUIRES_NEW,
     timeout = 3 )
    @Override
    public void purchase(String username, int isbn) {
        //测试强制回滚
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //读取书的单价
        int price = bookShopDao.findBookPriceByIsbn(isbn);
        //更新书的库存
        bookShopDao.updateBookStock(isbn);
        //更新用余额
        bookShopDao.updateUserAccount(username,price);
    }
}

