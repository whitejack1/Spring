package Proxy.SpringBean;
/*
 * 被代理的类(target)
 */
public class UserService implements UserServiseImp{
	@Override
	public void test1() {
		System.out.println("执行事务test1");	
	}
	@Override
	public void test2() {
		System.out.println("执行事务test2");	
	}
}
