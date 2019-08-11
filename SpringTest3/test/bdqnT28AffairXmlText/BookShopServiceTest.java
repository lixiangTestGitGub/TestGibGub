/**
 * @description
 * @author Administrator
 * @create 2019-5-24
 * @since 1.0.0
 */
package bdqnT28AffairXmlText;


import bdqnT28AffairXml.cxService.BookShopService;
import bdqnT28AffairXml.cxService.Cashier;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Administrator on 2019-5-24.
 */
public class BookShopServiceTest {
    @Test
    public  void  show(){
        ApplicationContext ab = new ClassPathXmlApplicationContext("bean-AffairtestXml.xml");
          BookShopService bean = (BookShopService) ab.getBean("bookShopservice");
          bean.purchase("张三",1);
    }

    //测试事务传播
    @Test
    public  void  show1(){
        ApplicationContext ab = new ClassPathXmlApplicationContext("bean-AffairtestXml.xml");
        Cashier bean = (Cashier) ab.getBean("cashierimpl");
        bean.checkout("张三", Arrays.asList(1,2));
    }

}
