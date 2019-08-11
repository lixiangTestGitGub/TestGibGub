/**
 * @description 测试bean的声明周期
 * @author Administrator
 * @create 2019-5-17
 * @since 1.0.0
 */
package bdqn.t28beanlifecycle;

/**
 * Created by Administrator on 2019-5-17.
 */
public class person {
      private  String name;

    public void setName(String name) {
        this.name = name;
    }

    public person() {
        System.out.println("调用了构造器");
    }
    public  void  init1(){
        System.out.println("初始化");
    }
    public  void  destroy1(){
        System.out.println("销毁方法");
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                '}';
    }
}
