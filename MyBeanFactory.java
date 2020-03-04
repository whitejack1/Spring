package Proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyBeanFactory {
	//��Ϊ��������нӿڵ��࣬���Դ����ص�����Ӧ���ǽӿ����͡�ʵ��������JDK�޷�����
	public static UserServiseImp createProxyService(){
		final UserServiseImp userservise = new UserService();
		final myAspect aspect = new myAspect();
		//���ص��ǽӿ����ͣ�������ʵ�������͡�
		UserServiseImp proxyservice = (UserServiseImp)Proxy.newProxyInstance(userservise.getClass().getClassLoader(),
				userservise.getClass().getInterfaces(), new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						aspect.before(method);
						Object obj = method.invoke(userservise, args);
						aspect.after(method);
						return obj;
					}
				});
		return proxyservice;
	}
	
	
}
