package bdqnT28AffairXml.cxDao;

/**
 * Created by Administrator on 2019-5-23.
 */
public interface BookShopDao {
    /**
     * 根据书号获取单价
     * @param isbn
     * @return
     */
    public int findBookPriceByIsbn(int isbn);

    /**
     * 跟新数据的库存 使对应的库存-1
     * @param isbn
     */
    public int updateBookStock(int isbn);

    /**
     * 更新账号的余额 使username的balance-price
     * @param username
     * @param price
     */
    public int updateUserAccount(String username, int price);


}
