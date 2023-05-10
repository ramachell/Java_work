package test.main;

public class MainClass03 {
	/*
	* [Java 기본 data type]
	* 논리형(boolean)
	* true, false
	*/
	public static void main(String[] args) {

		boolean isRun = true;
		if (isRun) {
			System.out.println("달려요");
		}
		boolean isGreater = 10 > 1; // true
		boolean result = false || true; // true
		// boolean result = false; 한번 선언한변수 재선언 불가능
		result = false; // 재선언없이 그냥 대입은 가능
		// result = 10; 다른타입 데이터 입력불가

	}

}
