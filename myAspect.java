package Proxy.jdk;

import java.lang.reflect.Method;

/*
 * ������(aspect)
 * ����д������ǿ���룬����Ҫ��ӵĴ��롣
 */
public class myAspect {
	public void before(Method method){
		System.out.println(method.getName() + "��ʼִ��");
	}
	public void after(Method method){
		System.out.println(method.getName() + "ִ�����");
	}
}
