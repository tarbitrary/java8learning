package net.xicp.tarbitrary;

public class ImplC implements InterfaceA, InterfaceB {

	/* (non-Javadoc)
	 * @see net.xicp.tarbitrary.InterfaceA#say()
	 * 如果一个类实现的两个接口中有同名的default方法, 则在这个类中必须覆盖掉这个default方法，否则会报错
	 */
	@Override
	public void say() {
		System.out.println("say C");
	}

}
