/**
 * @description 地址类
 * @author Administrator
 * @create 2019-5-16
 * @since 1.0.0
 */
package bdqn.t28beanFatory;

/**
 * Created by Administrator on 2019-5-16.
 */
public class addressA {

        private  String  zhuzhi;
        private  String  city;

    public String getZhuzhi() {
        return zhuzhi;
    }

    public void setZhuzhi(String zhuzhi) {
        this.zhuzhi = zhuzhi;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public addressA() {
    }

    public addressA(String zhuzhi, String city) {
        this.zhuzhi = zhuzhi;
        this.city = city;
    }

    @Override
    public String toString() {
        return "addressA{" +
                "zhuzhi='" + zhuzhi + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
