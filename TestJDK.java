package Proxy.jdk;

public class TestJDK {
	public static void main(String[] args) {
		UserServiseImp proxyservice = MyBeanFactory.createProxyService();
		proxyservice.test1();
		proxyservice.test2();
	}
}
