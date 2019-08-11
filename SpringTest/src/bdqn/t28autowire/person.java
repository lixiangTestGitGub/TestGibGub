/**
 * @description 人类
 * @author Administrator
 * @create 2019-5-16
 * @since 1.0.0
 */
package bdqn.t28autowire;

/**
 * Created by Administrator on 2019-5-16.
 */
public class person {
    private  String name;
    private  address address;
    private  car car;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public bdqn.t28autowire.address getAddress() {
        return address;
    }

    public void setAddress(bdqn.t28autowire.address address) {
        this.address = address;
    }

    public bdqn.t28autowire.car getCar() {
        return car;
    }

    public void setCar(bdqn.t28autowire.car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", addressA=" + address +
                ", car=" + car +
                '}';
    }
}
