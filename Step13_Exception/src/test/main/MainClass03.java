package test.main;

import java.util.Scanner;

public class MainClass03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("나눌 수 입력 : ");
		String inputNum1 = scan.nextLine();
		System.out.println("나누어지는 수 입력 : ");
		String inputNum2 = scan.nextLine();
		try {
			int num1 = Integer.parseInt(inputNum1);
			int num2 = Integer.parseInt(inputNum2);

			int result = num2 / num1;
			int result2 = num2 % num1;
			System.out.println(num2 + " 를 " + num1 + " 으로 나눈 몫 : " + result);

			System.out.println(num2 + " 를 " + num1 + " 으로 나눈 나머지 : " + result2);
			// 무슨 예외가 발생할지 잘 모를때엔 걍 Exception 쓸수있음
		} catch (Exception e) {
			System.out.println("예외가 발생했습니다");
			System.out.println("예외 메시지 : " + e.getMessage());
		} finally {
			// 예외가 발생해도 무조건 실행할 블럭
			// 중요한 마무리 작업을 여기서 수행함
			System.out.println("진짜 중요한 마무리 작업 함!");
		}

//		} catch (ArithmeticException ae) {
//			System.out.println("0으로 나눌수 없어요!");
//		} catch (NumberFormatException nfe) {
//			System.out.println("int type 을 입력해주세요!");
//		}

		System.out.println("main 메소드가 정상 종료 됩니다.");

		/* Exception 은 모든 Exception의 부모 type
		 * 
		 * 예외의 종류는 크게 2가지
		 * RuntimeException 상속받은예외
		 * try ~ catch 로 감싸는것은 option이다
		 * 
		 * RuntimeException 상속 받지 않은 예외
		 * try ~ catch 로 감싸는것은 의무 
		 * 안지키면 오류발생
		 * 
		 */
	}

}
