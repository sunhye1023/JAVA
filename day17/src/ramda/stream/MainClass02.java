package ramda.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass02 {

	public static void main(String[] args) {
	
		List<Integer> list = new ArrayList<>();
		
		for(int i=0;i<100;i++) {
			list.add(new Random().nextInt(100) + 1);
		}
		
		System.out.print(list.toString());
		
		System.out.println("\n-----------------------------------------------------------------");
		
		//중복제거distinct()
//		Stream<Integer> stream1 = list.stream();
//		Stream<Integer> stream2 = stream1.distinct();
		
		Stream<Integer> stream1 = list.stream().distinct();
		
		list.stream().distinct().forEach((num)-> System.out.print(num + " "));
		//list값의 중복제거 후 forEach (distinct도 stream<Integer>로 반환하여 .을 이용한다)
		//forEach -> void형의 최종처리 메서드(Stream의 기능 적용x)
		
		System.out.println("\n-----------------------------------------------------------------");
		
		//걸러내는 기능 filter()
		Stream<Integer> s1 =list.stream().filter((num)->{
			return num%2==0; //true일 경우에만 반환
		});
		
		s1.forEach((num)->System.out.print(num + " "));
		
		System.out.println("\n-----------------------------------------------------------------");
		
		//정렬 sorted()
		list.stream().sorted().forEach((num)->System.out.print(num + " "));
		
		System.out.println("\n-----------------------------------------------------------------");
		
		//map()은 메서드 안에 정의된 새로운 stream으로 반환
		Stream<String> s2 = list.stream().map((num)->{
			return num % 2 == 0 ? "짝수" : "홀수";
		});
		
		s2.forEach((str)->System.out.print(str + " "));
		
		System.out.println("\n-----------------------------------------------------------------");
		
		List<Integer> result = list.stream().filter((num)->{
			return num%3==0;
		}).collect(Collectors.toList()); //list형태로 반환
		
		System.out.println(result.toString());
		
		System.out.println("\n-----------------------------------------------------------------");
		
		//list의 중복을 제거 -> 짝수만 찾기 -> 정렬 -> 짝홀수로 변경
		//그 결과를 List로 반환받고 forEach구문으로 처리
		list.stream().distinct().filter((num)->num%2==0).sorted().map((num)->num%2==0?"짝":"홀").collect(Collectors.toList()).forEach((num)->{
			System.out.print(num + " ");
		});
		
	}
}
