package net.xicp.tarbitrary;

/**
 * @author tarbitrary
 *
 */
public interface NewFeatureInterface {
	
	/**
	 * java8中接口中可以有静态方法，调用方法接口名.方法名直接调用即可 
	 */
	public static void sayHello() {
		System.out.println("Hello tarbitrary!");
	}
	
	/**
	 *java8中接口中可以有default修饰的方法， 子类可以选择是否重写，如果重写调用则会动态绑定子类中的方法
	 *否则调用的时候则调用接口中的方法
	 */
	default void say() {
		 System.out.println("just a kidding!");
	 }

}
