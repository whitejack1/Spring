package Proxy.SpringBean;
/*
 * ���������(target)
 */
public class UserService implements UserServiseImp{
	@Override
	public void test1() {
		System.out.println("ִ������test1");	
	}
	@Override
	public void test2() {
		System.out.println("ִ������test2");	
	}
}
