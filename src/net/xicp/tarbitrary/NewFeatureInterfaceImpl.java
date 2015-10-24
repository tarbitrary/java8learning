package net.xicp.tarbitrary;

public class NewFeatureInterfaceImpl implements NewFeatureInterface {
/*	@Override
	public void say() {
		System.out.println(NewFeatureInterfaceImpl.super.getClass());
		System.out.println("the say method extend from interface");
	}*/
	
	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.println("haha");
		NewFeatureInterface.super.say();
		System.out.println(NewFeatureInterface.class);
		System.out.println("what are you doing");
	}
}
