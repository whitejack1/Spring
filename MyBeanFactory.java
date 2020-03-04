package Proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyBeanFactory {
	//因为代理的是有接口的类，所以代理返回的类型应该是接口类型。实现类类型JDK无法代理。
	public static UserServiseImp createProxyService(){
		final UserServiseImp userservise = new UserService();
		final myAspect aspect = new myAspect();
		//返回的是接口类型，并不是实现类类型。
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
