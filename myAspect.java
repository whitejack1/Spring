package Proxy.jdk;

import java.lang.reflect.Method;

/*
 * 切面类(aspect)
 * 里面写的是增强代码，即需要添加的代码。
 */
public class myAspect {
	public void before(Method method){
		System.out.println(method.getName() + "开始执行");
	}
	public void after(Method method){
		System.out.println(method.getName() + "执行完毕");
	}
}
