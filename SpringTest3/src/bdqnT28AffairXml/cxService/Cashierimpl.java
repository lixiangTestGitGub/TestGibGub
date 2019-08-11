/**
 * @description 测试事务的传播
 * @author Administrator
 * @create 2019-5-24
 * @since 1.0.0
 */
package bdqnT28AffairXml.cxService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2019-5-24.
 */

public class Cashierimpl implements Cashier {

    private BookShopService bookShopService;

    public void setBookShopService(BookShopService bookShopService) {
        this.bookShopService = bookShopService;
    }

    @Override
    public void checkout(String username, List<Integer> isbns) {
       for (Integer is: isbns){
           bookShopService.purchase(username, is);
       }
    }
}
