/**
 * @description 汽车类
 * @author Administrator
 * @create 2019-5-16
 * @since 1.0.0
 */
package bdqn.t28autowire;

/**
 * Created by Administrator on 2019-5-16.
 */
public class car {
    private  String color;
    private  String pingpai;
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPingpai() {
        return pingpai;
    }

    public void setPingpai(String pingpai) {
        this.pingpai = pingpai;
    }


    @Override
    public String toString() {
        return "car{" +
                "color='" + color + '\'' +
                ", pingpai='" + pingpai + '\'' +
                '}';
    }

    public car() {
        System.out.println("作用域测试");
    }
}
