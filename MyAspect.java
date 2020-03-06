package Spring.aop.xml;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;


public class MyAspect{
	//joinpoint相当于将需要通知的方法传入进去，以此可以获取方法名。
	public void myBefore(JoinPoint joinpoint){
		System.out.println("前" + joinpoint.getSignature().getName());
	}
	//ref参数是可以方法的返回值。
	public void myAfterReturning(JoinPoint joinpoint, Object ref){
		System.out.println("后");
	}
	/*
	 * 此处与aop编程环绕通知不同的是：
	 *  由于并没有实现接口MethodIntercertor接口，所以参数类型与aop编程时的环绕通知不同。
	 */
	public Object myAround(ProceedingJoinPoint mi) throws Throwable {
		System.out.println("前");
		Object obj = mi.proceed();
		System.out.println("后");
		return obj;
	}
	public void myThrowing(JoinPoint joinpoint, Throwable e){
		System.out.println("抛出异常通知" + e.getMessage());
	}
	public void myAfter(JoinPoint joinpoint){
		System.out.println("最终通知" + joinpoint.getSignature().getName());
	}
}
