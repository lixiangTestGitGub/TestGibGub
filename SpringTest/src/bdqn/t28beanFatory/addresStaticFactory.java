/**
 * @description 测试静态工厂方法
 * @author Administrator
 * @create 2019-5-18
 * @since 1.0.0
 */
package bdqn.t28beanFatory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2019-5-18.
 */
public class addresStaticFactory {
    private  static Map<String,address> address = new HashMap<String,address>();
    static {
        address.put("a",new address("今晚自","长沙"));
        address.put("b",new address("五道口","北京"));
    }

    public  static address getAddress(String name){
        return address.get(name);
    }

}
