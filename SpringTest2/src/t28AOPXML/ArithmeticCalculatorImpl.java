/**
 * @description
 * @author Administrator
 * @create 2019-5-20
 * @since 1.0.0
 */
package t28AOPXML;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2019-5-20.
 */
public class ArithmeticCalculatorImpl implements ArithmeticCalculator {
    @Override
    public int add(int a, int b) {
        int count = a+b;
        return count;
    }

    @Override
    public int sub(int a, int b) {
        int count = a-b;
        return count;
    }

    @Override
    public int mul(int a, int b) {
        int count = a*b;
        return count;
    }

    @Override
    public int div(int a, int b) {
        int count = a/b;
        return count;
    }
}
