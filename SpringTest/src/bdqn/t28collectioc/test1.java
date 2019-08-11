package bdqn.t28collectioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.zip.CRC32;

public class test1 {

	 public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContest.xml");
//		Object bean = context.getBean("person2");
//		System.out.println("装配集合属性"+bean);
//		DeteSource bean2 = context.getBean(DeteSource.class);
//		System.out.println("测试使用props 和 prop 子节点"+bean2);

		 Object person5 = context.getBean("person5");
		 System.out.println("spring2.5新增p"+person5);

		 Object carss = context.getBean("carss");
		 System.out.println(carss);
	 }
}
