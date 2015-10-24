package net.xicp.tarbitrary.lambda;

import java.io.File;

/**
 * @author tarbitrary
 * @created_time 2015年10月24日 下午10:11:24
 */
public class FileFilterLambda {
	public static void main(String[] args) {
		String path = Thread.currentThread().getContextClassLoader().getResource("filter").getPath();
		File f = new File(path);
		for (String st : f.list()) {
			System.out.println(st);
		}
		
		System.out.println("*******************");
		//利用lambda表达式过滤掉txt文件
		File[] files = f.listFiles((filename) -> {
			return !filename.getName().endsWith(".txt");
		});
		
		for (File st : files) {
			System.out.println(st.getName());
		}
	}

}
