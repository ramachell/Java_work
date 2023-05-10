package test.main;

import java.util.HashMap;

import test.mypac.Car;

/*
  java 에서 어떤 데이터를 key : value 의 쌍으로 관리하고 싶으면
  
  HashMap 객체를 사용한다
  
  key 의 generic도 맘대로 지정되지만 보통 String
  
  value 의 generic은 상황따라 다르지만 Object로 하면 대부분 모든값 수용가능
 */
public class MainClass06 {
	public static void main(String[] args) {
		HashMap<String, Object> map1 = new HashMap<>();
		map1.put("num", 1); // Integer type
		map1.put("name", "김구라"); // String
		map1.put("isMan", true); // boolean
		map1.put("car", new Car("소나타")); // Car
		System.out.println(map1.get("num"));
		System.out.println(map1);

		// map1 저장타입을 Object로 지정했기에 get은 Object type을 리턴해줌 쓰려면 casting 해야함 (int)
		// (String) 등등
		int num = (int) map1.get("num");
		map1.remove("num"); // 제거한다 성공하면 true 실패시 false 리턴한다 이 t f 를 쓰든 안쓰든 무방
		map1.clear(); // map1 데이터 전체 초기화
	}

}
