package Spring.aop.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "Spring/aop/xml/applicationContext.xml" });
		//Spring工厂最终返回的类就是原目标类id,即Spring是在原目标类的基础上进行切入添加的通知。
		UserServiseImp proxyservice = (UserServiseImp) context.getBean("userserviceID");
		proxyservice.test1();
		proxyservice.test2();
	}
}
