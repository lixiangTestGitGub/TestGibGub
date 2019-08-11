/**
 * @description
 * @author Administrator
 * @create 2019-5-29
 * @since 1.0.0
 */
package bdqn.t28beanlifecycle.nes;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by Administrator on 2019-5-29.
 */
public class MyBean implements BeanNameAware,BeanFactoryAware,BeanPostProcessor,InitializingBean,ApplicationContextAware{
    @Override
    public void setBeanName(String s) {
        System.out.println("BeanNameAware-->"+s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactory-->"+beanFactory);
    }

    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("postProcessBeforeInitialization后置处理器-->"+o+"  "+s);
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("postProcessBeforeInitialization后置处理器-->"+o+"   "+s);
        return o;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet-->");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("applicationContext-->"+applicationContext);
    }
}
