/**
 * @description
 * @author Administrator
 * @create 2019-5-18
 * @since 1.0.0
 */
package bdqn.t28beanFatory;

import org.springframework.beans.factory.FactoryBean;

/**
 * Created by Administrator on 2019-5-18.
 */
public class AddressFactoryBean implements FactoryBean<addressA> {
    private  String zhuhzi;

    public void setZhuhzi(String zhuhzi) {
        this.zhuhzi = zhuhzi;
    }

    /**
     * @return返回bean的对象
     * @throws Exception
     */
    @Override
    public addressA getObject() throws Exception {
        this.zhuhzi=zhuhzi;
        return new addressA(zhuhzi,"长沙");
    }

    /**
     *
     * @return返回bean的类型
     */
    @Override
    public Class<?> getObjectType() {
        return addressA.class;
    }

    /**
     *
     * @return返回布尔
     */
    @Override
    public boolean isSingleton() {
        return true;
    }

}
