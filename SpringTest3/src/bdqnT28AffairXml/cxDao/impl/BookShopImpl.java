/**
 * @description
 * @author Administrator
 * @create 2019-5-23
 * @since 1.0.0
 */
package bdqnT28AffairXml.cxDao.impl;


import bdqnT28AffairXml.cxDao.BookShopDao;
import bdqnT28AffairXml.cxDao.BookStockException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2019-5-23.
 */

public class BookShopImpl implements BookShopDao {


    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int findBookPriceByIsbn(int isbn) {
        String sql = "SELECT price FROM book WHERE isbn=?";
        return jdbcTemplate.queryForObject(sql,Integer.class,isbn);
    }
    @Override
    public int updateBookStock(int isbn) {
        //查询库存
         String sql="SELECT stock FROM bookstorck WHERE isbn =?";
        Integer integer = jdbcTemplate.queryForObject(sql, Integer.class, isbn);
        if (0>=integer){
         throw   new BookStockException("库存不足");
        }
        //如果库存有就-1
        String sql1="UPDATE bookstorck SET stock=stock-1 WHERE isbn=?";
        return jdbcTemplate.update(sql1, isbn);
    }

    @Override
    public int updateUserAccount(String username, int price) {
        //验证余额是否足够
        String sql2="SELECT balance FROM account WHERE username=?";
        Integer integer = jdbcTemplate.queryForObject(sql2, Integer.class, username);
        if (integer<price){
            //余额不足回滚
            throw  new BookStockException("余额不足");
        }
        String sql="UPDATE account SET balance = balance-? WHERE username = ?";
        return  jdbcTemplate.update(sql,price,username);
    }
}
