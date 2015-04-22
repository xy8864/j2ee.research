package j2ee.research.tutorial.google.guava.collect.set;

import java.util.Set;
import com.google.common.collect.Sets;

public class SetDifferenceExample {
	public static void main(String[] args) {
		Set<String> names1=Sets.newHashSet();
		names1.add("Tim");
		names1.add("Tom");
		names1.add("Ted");
		Set<String> names2=Sets.newHashSet();
		names2.add("Susan");
		names2.add("Tony");
		names2.add("Ted");
		Set<String> difference=Sets.difference(names1,names2);
		for(String name:difference){
			System.out.printf("%s\n",name);
		}
	}
}
