/**
 * @description 测试事务的传播
 * @author Administrator
 * @create 2019-5-24
 * @since 1.0.0
 */
package com.bdqnT28Affair.cxService;

import com.sun.xml.internal.bind.v2.model.core.ID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2019-5-24.
 */
@Service("cashier")
public class Cashierimpl implements  Cashier {

    @Autowired
    private  BookShopService bookShopService;

    @Transactional
    @Override
    public void checkout(String username, List<Integer> isbns) {
       for (Integer is: isbns){
           bookShopService.purchase(username, is);
       }
    }
}
