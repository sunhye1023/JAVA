package anonymous.basic02;

public class Tv {

	private int volume;
	private RemoteControl remote;

	public Tv() {
		//remote타입을 Tv에 알맞게 익명객체 방법으로 초기화해주세요
		remote = new RemoteControl() {

			public void turnOn() {
				System.out.println("Tv를 켭니다");
			}

			public void turnOff() {
				System.out.println("Tv를 끕니다");
			}

			public void volumeUp() {
				volume++;
				System.out.println("소리 UP : " + volume);
			}

			public void volumeDown() {
				volume--;
				System.out.println("소리 DOWN : " + volume);
			}
			
		};
		
	}
	
	//getter, setter
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public RemoteControl getRemote() {
		return remote;
	}
	public void setRemote(RemoteControl remote) {
		this.remote = remote;
	}
	
	
	
	
}
