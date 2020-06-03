package ramda.basic;

public class MainClass {

	public static void main(String[] args) {
		
		Person p = new Person();
		p.greeting(new Say01() {

			@Override
			public void talking() {
				System.out.println("하이");
				
			}
			
		});
		
		
		p.greeting(new Say02() {

			@Override
			public String talking() {
				System.out.println("헬로");
				return "헬로";
			}
			
		});
		
		
		p.greeting(new Say03() {

			@Override
			public String talking(String greet) {
				System.out.println(greet);
				return greet;
			}
			
		});
		
		System.out.println("================================");
		
		
		//익명객체Say01이 구현해야 할 추상메서드를 람다식으로 표현
		p.greeting(()->{
			System.out.println("하이");
		});
		
		
		p.greeting(()->{
			System.out.println("헬로");
			return "헬로";
		});
		
		
		p.greeting((greet)->{
					//(greet)대신 (String greet)를 작성하여 사용할 수도 있다
			System.out.println(greet);
			return greet;
		});
		
		
		//greeting 메서드를 실행해서 결과로 HiHiHi반환 받는 람다표현식을 작성하세요
		p.greeting((word, i)->{
			for(int j=1; j<=i;j++) {
			System.out.print(word);
			}
			return word;
		});
		
	}
}
