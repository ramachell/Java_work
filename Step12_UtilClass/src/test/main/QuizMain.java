package test.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizMain {
	public static void main(String[] args) {
		// 1. Scanner 객체 생성해서 scan 담기
		Scanner scan = new Scanner(System.in);

		// 2. ArrayList 객체 생성해서 msgs란 지역변수 담기
		List<String> msgs = new ArrayList<>();

		// 3. 반복문 5번 돌면서 문자열 5번 입력받아 ArrayList 순서대로 저장
		for (int i = 0; i < 5; i++) {
			msgs.add(scan.nextLine());
			// scan 객체 안만들고 이렇게도 가능
			// msgs.add(new Scanner(System.in).nextLine());
		}
		// 4. 반복문 활용해서 ArrayList 순서대로 출력
		for (int i = 0; i < msgs.size(); i++) {
			System.out.println(msgs.get(i));
		}
		System.out.println("-----------------");
		for (String s : msgs) {
			System.out.println(s);
		}
		System.out.println("-----------------");
		msgs.forEach(t -> {
			System.out.println(t);
		});

	}

}
