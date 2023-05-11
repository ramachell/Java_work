package test.main;

import java.util.HashSet;
import java.util.Set;

/*
 * HashSet 은 Set 인터페이스를 구현한 클래스
 * 
 * 순서가 없음
 * key값도 없음
 * 중복을 허용하지 않음
 * 어떤 data를 묶음(집합)으로 관리하고자 할때 사용한다.
 */

public class MainClass08 {
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();
		set1.add(9);
		set1.add(9);
		set1.add(5);
		set1.add(653);

		// 문자열을 저장할수 있는 HashSet 객체
		Set<String> set2 = new HashSet<>();
		set2.add("a");
		set2.add("b");
		set2.add("ee");
		set2.add("ff");
		set2.add("gggg");
	}

}
