package abs.good;

public class BusanStore extends HeadStore {

	@Override
	public void apple() {
		System.out.println("부산지점 사과는 200원");
	}

	@Override
	public void banana() {
		System.out.println("부산지점 바나나는 300원");
	}

	@Override
	public void orange() {
		System.out.println("부산지점 오렌지는 400원");
	}

	@Override
	public void melon() {
		System.out.println("부산지점 멜론은 500원");
	}

}
