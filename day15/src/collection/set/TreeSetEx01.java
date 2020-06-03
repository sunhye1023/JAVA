package collection.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx01 {

	public static void main(String[] args) {
		
		//중복 x , 자동으로 오름차순 정렬
		Set<String> set = new TreeSet<>();
		
		set.add("강아지");
		set.add("강아지");
		set.add("망아지");
		set.add("하마");
		set.add("송아지");
		
		System.out.println(set.toString());
		
		Set<Integer> set2 = new TreeSet<>();
		
		set2.add(71);
		set2.add(89);
		set2.add(13);
		set2.add(45);
		
		System.out.println(set2.toString());
		
		
	}
}
