package bdqnT28AffairXml.cxService;

import java.util.List;

/**
 * Created by Administrator on 2019-5-24.
 */
public interface Cashier {
    /**
     * 测试事务的传播
     * @param username
     * @param isbns
     */
    public void checkout(String username, List<Integer> isbns);
}
