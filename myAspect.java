package Proxy.SpringBean;
/**
 * Spring工厂代理与手动代理的切面类的区别在于，将需要运行的代理代码直接写到切面类里，Spring通过拦截的方式，拦截到切面类里执行。
 */

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class myAspect implements MethodInterceptor{
	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		System.out.println(mi.getMethod().getName() + "开始执行");
		Object obj = mi.proceed();
		System.out.println(mi.getMethod().getName() + "执行完毕");
		return obj;
	}
}
