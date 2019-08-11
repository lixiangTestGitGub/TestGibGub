/**
 * @description
 * @author Administrator
 * @create 2019-5-29
 * @since 1.0.0
 */
package bdqn.t28beanlifecycle.nes;

/**
 * Created by Administrator on 2019-5-29.
 */
public class student {
    private  String name;

    public void setName(String name) {
        this.name = name;
    }
    public student() {
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
        return "student{" +
                "name='" + name + '\'' +
                '}';
    }
}
