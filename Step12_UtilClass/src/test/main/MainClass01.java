package test.main;

import java.util.ArrayList;

/*
 * java 에서 배열은 크기를 조절할수 없는 고정 배열이다
 * 
 * 따라서 동적으로 item 을 추가하고 삭제하는 작업을 하려면 일반 배열은 사용할수 없다
 * 
 * 그래서 해당 작업을 하려면 ArrayList 객체를 사용하면 된다.
 */
public class MainClass01 {
	public static void main(String[] args) {
		// String type 을 저장할수 있는 ArrayList 객체 생성해서 참조값 names에 담기
		ArrayList<String> names = new ArrayList<>();
		ArrayList<String> names2 = names;
		names.add("1");
		names.add("2");
		names.add("3");

		System.out.println(names);
		System.out.println(names2);
		names.remove(0);
		System.out.println(names2);
		names.remove(0);
		System.out.println(names2);
		System.out.println(names.size());
		names.clear();

		// "김구라", "해골", "원숭이" 3개의 String type를 저장해보기
		names.add("김구라");
		names.add("해골");
		names.add("원숭이");
		// 0번방의 아이템 불러와서 item 이란 변수에 담기
		String item = names.get(0);
		// 1번방의 아이템 삭제
		names.remove(1);
		// 0번방에 "에이콘"을 넣고싶다면
		names.add(0, "에이콘");
		System.out.println(names);
		// 저장된 아이템 갯수를 size 란 지역변수에 담기
		int size = names.size();
		System.out.println(names.clone());
		Object names3;
		names3 = names.clone();
		System.out.println(names3);
		// 저장된 모든 아이템 삭제
		names.clear();

	}

}
