package Proxy.SpringBean;
/**
 * Spring�����������ֶ��������������������ڣ�����Ҫ���еĴ������ֱ��д���������Springͨ�����صķ�ʽ�����ص���������ִ�С�
 */

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class myAspect implements MethodInterceptor{
	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		System.out.println(mi.getMethod().getName() + "��ʼִ��");
		Object obj = mi.proceed();
		System.out.println(mi.getMethod().getName() + "ִ�����");
		return obj;
	}
}
