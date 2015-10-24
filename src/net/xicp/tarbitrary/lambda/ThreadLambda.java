package net.xicp.tarbitrary.lambda;

public class ThreadLambda {
		public static void main(String[] args) {
			Thread t = new Thread(new Runnable() {
				@Override
				public void run() {
					for (int i  = 0; i < 100; i ++) {
						System.out.println("匿名内部类实现" + i);
					}
				}
			});
			
			Thread t2 = new Thread(() -> {
				for (int i = 0; i < 100; i ++) {
					System.out.println("lambda表达式实现" + i);
				}
			});
			
			t.start();
			t2.start();
			
		}

}
