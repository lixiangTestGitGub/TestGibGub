/**
 * @description 作用域测试
 * @author Administrator
 * @create 2019-5-17
 * @since 1.0.0
 */
package bdqn.t28beanScope;

import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * Created by Administrator on 2019-5-17.
 */
public class Scope {
    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Scope() {
        System.out.println("scope测试");
    }
}
