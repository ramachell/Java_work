package test.main;

import java.util.Scanner;

public class MainClass06 {
	public static void main(String[] args) {
		// 1. 문자열을 저장할수있는 5칸짜리 배열객체 생성후 참조값을 msgs 라는 지역변수에 담기.

		// 2. 키보드로 부터 입력 받을수 있는 Scanner 객체 생성해서 참조값을 scan(지역변수)에 담기.

		// 3. 반복문을 위에서(1번) 생성한 배열의 방의 갯수만큼 돌면서 키보드로 부터 문자열을 입력받아서 배열에 순서대로 저장.

		// 4. 반복문 돌면서 배열에 저장되있던 모든 문자열을 순서대로 콘솔창에 출력.

		String[] msgs = new String[5];

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < msgs.length; i++) {
			System.out.print("입력하세요 : ");
			msgs[i] = scan.nextLine();
		}
		for (int i = 0; i < msgs.length; i++) {
			System.out.println(msgs[i]);
		}
		for (String string : msgs) {
			System.out.println(string);
		}
	}

}
