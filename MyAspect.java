package Spring.aop.xml;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;


public class MyAspect{
	//joinpoint�൱�ڽ���Ҫ֪ͨ�ķ��������ȥ���Դ˿��Ի�ȡ��������
	public void myBefore(JoinPoint joinpoint){
		System.out.println("ǰ" + joinpoint.getSignature().getName());
	}
	//ref�����ǿ��Է����ķ���ֵ��
	public void myAfterReturning(JoinPoint joinpoint, Object ref){
		System.out.println("��");
	}
	/*
	 * �˴���aop��̻���֪ͨ��ͬ���ǣ�
	 *  ���ڲ�û��ʵ�ֽӿ�MethodIntercertor�ӿڣ����Բ���������aop���ʱ�Ļ���֪ͨ��ͬ��
	 */
	public Object myAround(ProceedingJoinPoint mi) throws Throwable {
		System.out.println("ǰ");
		Object obj = mi.proceed();
		System.out.println("��");
		return obj;
	}
	public void myThrowing(JoinPoint joinpoint, Throwable e){
		System.out.println("�׳��쳣֪ͨ" + e.getMessage());
	}
	public void myAfter(JoinPoint joinpoint){
		System.out.println("����֪ͨ" + joinpoint.getSignature().getName());
	}
}
