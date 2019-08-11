/**
 * @description 学生实体类
 * @author Administrator
 * @create 2019-5-26
 * @since 1.0.0
 */
package ssm.entity;

/**
 * Created by Administrator on 2019-5-26.
 */
public class studentDto {

    private  Integer id;
    private  String name;
    private  String address;
    private  Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
