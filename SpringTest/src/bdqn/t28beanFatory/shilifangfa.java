/**
 * @description 实例方法配置bean
 * @author Administrator
 * @create 2019-5-18
 * @since 1.0.0
 */
package bdqn.t28beanFatory;

import bdqn.t28.Car;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2019-5-18.
 */
public class shilifangfa {
 private   Map<String,address> map = null;

 public  shilifangfa(){
     map = new HashMap<String,address>();
     map.put("zhangsan",new address("经弯路","长沙"));
     map.put("lisi",new address("浦江街道","上海"));
 }

 public  address getAddress(String name){
     return  map.get(name);
 }
}
