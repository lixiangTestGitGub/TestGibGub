/**
 * @description
 * @author Administrator
 * @create 2019-5-23
 * @since 1.0.0
 */
package com.bdqnT28Affair.cxDao;

/**
 * Created by Administrator on 2019-5-23.
 */
public class BookStockException extends  RuntimeException {

    public BookStockException() {
        super();
    }

    public BookStockException(String message) {
        super(message);
    }

    public BookStockException(String message, Throwable cause) {
        super(message, cause);
    }

    public BookStockException(Throwable cause) {
        super(cause);
    }

    protected BookStockException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
