package test.main;

import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args) {
		System.out.println("main 메소드 시작");

		// 키보드로 값 입력받을수있는 객체 생성
		Scanner scan = new Scanner(System.in);
		// 개행 기호를 출력하지 않고 콘솔창에 문자열 출력하기 .print() 메소드를 활용하면 된다.
		System.out.print("문자열 입력 : ");
		// 문자열 한줄 입력받고
		String str = scan.nextLine();
		// 입력받은 문자열 콘솔출력
		System.out.println(str);
		System.out.println("main 메소드 종료");
	}

}
