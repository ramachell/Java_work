package test.main;

public class MainClass04 {
	public static void main(String[] args) {

		System.out.println("main 메소드 시작");

		try {

			/*
			 * 실행의 흐름을 스레드 라고 하는데 스레드를 임의로 5초간 잡아두기
			 * 컴파일시에 발생하는 Exception(RuntimeException을 상속받지 않은 Exception)
			 * 이 발생하기 때문에 반드시 try~catch로 예외 처리를 해줘야함
			 */
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();

		}

		System.out.println("main 메소드 종료");
	}

}
