/**
 * @description
 * @author Administrator
 * @create 2019-5-23
 * @since 1.0.0
 */
package com.bdqnT28Affair.cxDao.impl;


import com.bdqnT28Affair.cxDao.BookShopDao;
import com.bdqnT28Affair.cxDao.BookStockException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2019-5-23.
 */

@Repository("bookShopdao")
public class BookShopImpl implements BookShopDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;
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
         throw   new  BookStockException("库存不足");
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
