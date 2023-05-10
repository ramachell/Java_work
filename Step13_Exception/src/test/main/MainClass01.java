package test.main;

import java.util.Scanner;

public class MainClass01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		// 숫자 형식의 문자열을 입력받는다 ex "10.1", "10" 등등
		String inputNum = scan.nextLine();

		// try catch 를 통해서 예외 발생 처리 가능
		try {
			// 입력한 문자열을 숫자로 바꾼다
			double num = Double.parseDouble(inputNum);
			// 입력한 숫자에 100을 더한다
			double result = num + 100;
			System.out.println("입력한 숫자 + 100 = " + result);

		} catch (NumberFormatException nfe) {
			nfe.printStackTrace();
		}
		// 여기서부터 다시 진행
		System.out.println("뭔가 하고 main 메소드가 종료 됩니다!");
	}

}
