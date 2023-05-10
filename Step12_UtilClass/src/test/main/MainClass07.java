package test.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainClass07 {
	public static void main(String[] args) {

		/*
		 *  3명 회원정보를 HashMap 객체에 담아
		 *  
		 *  ArrayList에 누적시키기
		 *  
		 *  반복문 돌며 ArrayList 객체에 누적된 회원정보 콘솔 출력
		 *  
		 *  HashMap 객체 3개 ArrayList 객체 1개 생성
		 *  
		 *  ArrayList 객체에 HashMap 담을거니
		 *  ArrayList<HashMap<String, Object>> 필요
		 */

		HashMap<String, Object> map1 = new HashMap<>();
		HashMap<String, Object> map2 = new HashMap<>();
		HashMap<String, Object> map3 = new HashMap<>();
		HashMap<String, Object> map4 = new HashMap<>();
		List<HashMap<String, Object>> list = new ArrayList<>();
		map1.put("num", 1);
		map1.put("name", "김1번");
		map1.put("addr", "구로");
		list.add(map1);
		map2.put("num", 2);
		map2.put("name", "김2번");
		map2.put("addr", "강남");
		list.add(map2);
		map3.put("num", 3);
		map3.put("name", "김3번");
		map3.put("addr", "강북");
		list.add(map3);

		put(list, 4, "김4번", "부산");
		put(list, 4, "r2", "3w");
		map4.put("num", 1);
		map4.put("name", "김1번");
		map4.put("addr", "구로");
		list.add(map4);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		// put 어쩌구를 메소드 미리 만들어놓을수있지 않을까?

		// 그렇다면 아예 클래스로 받아서 넣을수있지 않을까
	}

	// 위의 put, add 한번에 묶은 메소드
	static void put(List<HashMap<String, Object>> list, int num, String name, String addr) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("num", num);
		map.put("name", name);
		map.put("addr", addr);
		list.add(map);
	}

}
