package Spring.aop.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "Spring/aop/xml/applicationContext.xml" });
		//Spring�������շ��ص������ԭĿ����id,��Spring����ԭĿ����Ļ����Ͻ���������ӵ�֪ͨ��
		UserServiseImp proxyservice = (UserServiseImp) context.getBean("userserviceID");
		proxyservice.test1();
		proxyservice.test2();
	}
}
