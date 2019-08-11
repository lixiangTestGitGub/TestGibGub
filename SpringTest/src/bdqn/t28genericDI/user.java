/**
 * @description
 * @author Administrator
 * @create 2019-5-19
 * @since 1.0.0
 */
package bdqn.t28genericDI;

/**
 * Created by Administrator on 2019-5-19.
 */
public class user {
    private  String name;

    public void setName(String name) {
        this.name = name;
    }

    public user(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "user{" +
                "name='" + name + '\'' +
                '}';
    }
}
