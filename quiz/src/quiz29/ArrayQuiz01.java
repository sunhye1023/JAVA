package quiz29;

import java.util.Arrays;

public class ArrayQuiz01 {

	public static void main(String[] args) {

		String[] participant = {"홍길동", "강감찬", "이순신", "신사임당", "유관순"};
		String[] completion = {"강감찬", "홍길동", "신사임당", "이순신"};

		System.out.println("완주하지 못 한 사람: " + solution(participant, completion));

	}

	
	public static String solution(String[] participant, String[] completion) {
		Arrays.sort(participant);
		Arrays.sort(completion);
		System.out.println(Arrays.toString(participant));
		System.out.println(Arrays.toString(completion));
		for(int i=0;i<completion.length;i++) {
			if(!participant[i].equals(completion[i])) {
				return participant[i];
			}
		}
		
		return participant[participant.length-1];
	}
	

}