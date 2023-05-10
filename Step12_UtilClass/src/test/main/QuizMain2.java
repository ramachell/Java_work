package test.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QuizMain2 {
	public static void main(String[] args) {

		// sample 데이터
		Map<String, String> dic = new HashMap<>();
		dic.put("house", "집");
		dic.put("phone", "전화기");
		dic.put("car", "자동차");
		dic.put("pencil", "연필");
		dic.put("eraser", "지우개");

		/*
		 * 검색할 단어를 입력하세요 : house
		 * house 의 뜻은 집입니다.
		 * 
		 * 검색할 단어를 입력하세요 : gura
		 * gura 는 목록에 없습니다. 
		 */

		Scanner scan = new Scanner(System.in);

		System.out.print("검색할 단어를 입력하세요 : ");
		String search = scan.nextLine();

		if (dic.containsKey(search)) {
			System.out.println(search + " 의 뜻은 " + dic.get(search) + " 입니다.");
		} else {
			System.out.println(search + " 는 목록에 없습니다.");
		}

	}

}
