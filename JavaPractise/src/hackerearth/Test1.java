package hackerearth;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Burger", "Pizza", "D", "Burger");
		Set<String> s1 = new HashSet<String>(list);
		Set<String> s2 = new TreeSet<String>(list);

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.equals(s2));
	}
}
