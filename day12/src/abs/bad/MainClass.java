package abs.bad;

public class MainClass {

	public static void main(String[] args) {
		
		//재정의를 빼먹는다면, 잘못된 메서드의 실행으로 이어질 수도 있다는 뜻입니다
		//HeadStore store = new SeoulStore(); 할 수 있다
		SeoulStore store = new SeoulStore();
		store.apple();
		store.banana();
		store.melon();
		store.orange();
		
		
		
		
	}
}
