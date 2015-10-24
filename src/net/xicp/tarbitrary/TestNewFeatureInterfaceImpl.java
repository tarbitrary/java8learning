package net.xicp.tarbitrary;

import org.junit.Test;

public class TestNewFeatureInterfaceImpl {

	@Test
	public void test() {
		NewFeatureInterface.sayHello();
		
		NewFeatureInterface newFeatureInterfaceImpl = new NewFeatureInterfaceImpl();
		newFeatureInterfaceImpl.say();
	}
	
	@Test
	public void testMultiExtends() {
		InterfaceA a = new ImplC();
		InterfaceA b = new ImplC();
		ImplC c = new ImplC();
		a.say();
		b.say();
		c.say();
	}

}
