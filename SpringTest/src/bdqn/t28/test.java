package bdqn.t28;


import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import bdqn.t28.HelloWord;

import javax.sound.midi.Soundbank;

public class test {

	public static void main(String[] args) {
//		 HelloWord ab = new 	HelloWord();
//			ab.setUserName("spring");
//			ab.hello();
//		 
		//创建spring的ioc容器
		 //ApplicationContest 代表IOC容器
		 //ClassPathXmlApplicationContext：是ApplicationContest 接口实现类 该实现类
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContest.xml");
		 HelloWord helloWord = (HelloWord) applicationContext.getBean("helloWord");
		 System.out.println(helloWord);
		 //调用方法
		 helloWord.hello();

		 //构造注入
		HelloWord helloWord1 =(HelloWord)  applicationContext.getBean("helloWord1");
		System.out.println(helloWord1);
		helloWord1.hello();

		//精确的构造注入
		Car car = (Car) applicationContext.getBean("car");
		System.out.println("构造注入1"+car);

		Car car1 = (Car) applicationContext.getBean("car1");
		System.out.println("构造注入2"+car1);

		//通过ref注入
		person p = (person) applicationContext.getBean("person1");
		System.out.println("ref注入list"+p);

	}
}
