package Proxy.SpringBean;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "Proxy/SpringBean/applicationContext.xml" });
		//��Ϊ��JDK��̬����������ǽӿ����ͣ����ص�ҲӦ���ǽӿ����͡�
		UserServiseImp proxyservice = (UserServiseImp) context.getBean("proxyServiceID");
		proxyservice.test1();
		proxyservice.test2();
	}
}
