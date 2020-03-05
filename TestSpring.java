package Proxy.SpringBean;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "Proxy/SpringBean/applicationContext.xml" });
		//因为是JDK动态代理，代理的是接口类型，返回的也应该是接口类型。
		UserServiseImp proxyservice = (UserServiseImp) context.getBean("proxyServiceID");
		proxyservice.test1();
		proxyservice.test2();
	}
}
