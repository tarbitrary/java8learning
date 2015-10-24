package net.xicp.tarbitrary.lambda;

import java.net.URL;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author tarbitrary
 * @created_time 2015年10月24日 下午10:00:14
 */
public class ComparatorLambda {
	public static void main(String[] args) {
		Set<String> s = new TreeSet<String>(new Comparator<String>() {
			public int compare(String o1, String o2) {
				return o1.compareToIgnoreCase(o2);
			};
		});
		s.add("abc");
		s.add("Acc");
		s.add("bde");
		s.add("hello");
		s.add("YYY");
		
		System.out.println(s);

		
		Set<String> s1 = new TreeSet<String>((o1, o2) -> {
				return o1.compareToIgnoreCase(o2);
		});
		s1.add("abc");
		s1.add("Acc");
		s1.add("bde");
		s1.add("hello");
		s1.add("YYY");
		
		System.out.println(s1);
		
	}

}
