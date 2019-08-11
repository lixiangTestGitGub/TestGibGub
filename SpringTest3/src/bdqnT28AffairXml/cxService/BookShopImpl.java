/**
 * @description
 * @author Administrator
 * @create 2019-5-23
 * @since 1.0.0
 */
package bdqnT28AffairXml.cxService;

import bdqnT28AffairXml.cxDao.BookShopDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2019-5-23.
 */
public class BookShopImpl implements BookShopService {


    private BookShopDao bookShopDao;

    public void setBookShopDao(BookShopDao bookShopDao) {
        this.bookShopDao = bookShopDao;
    }

    @Override
    public void purchase(String username, int isbn) {
        //测试强制回滚
        try {
            Thread.sleep(1000);
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

