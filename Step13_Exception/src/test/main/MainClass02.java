package test.main;

import java.util.Scanner;

public class MainClass02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("나눌 수 입력 : ");
		String inputNum1 = scan.nextLine();
		System.out.println("나누어지는 수 입력 : ");
		String inputNum2 = scan.nextLine();

		int num1 = Integer.parseInt(inputNum1);
		int num2 = Integer.parseInt(inputNum2);

		int result = num2 / num1; // 몫
		int result2 = num2 % num1; // 나머지
		System.out.println(num2 + " 를 " + num1 + " 으로 나눈 몫 :" + result);
		System.out.println(num2 + " 를 " + num1 + " 으로 나눈 나머지:" + result2);

		System.out.println("main 메소드가 정상 종료 됩니다.");
	}
}
