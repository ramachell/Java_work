package test.main;

// 6. 3항 연산자 테스트
public class MainClass06 {
	public static void main(String[] args) {
		boolean isWait = true;
		String result = isWait ? "기다려" : "기다리지마";

		System.out.println(result);

		// 3항은 아래 if와 같은동작
		String result2;
		if (!isWait) {
			result2 = "기다려";
		} else {
			result2 = "기다리지마";
		}
		System.out.println(result2);
	}
}
