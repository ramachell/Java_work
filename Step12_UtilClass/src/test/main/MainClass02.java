package test.main;

import java.util.ArrayList;

public class MainClass02 {
	public static void main(String[] args) {
		// 정수를 저장할 수 있는 ArrayList<Integer> 객체를 생성해서 참조값을 지역변수 nums에 담
		ArrayList<Integer> nums = new ArrayList<>();
		// 10 20 30 담기
		nums.add(10);
		nums.add(20);
		nums.add(30);
		// for 문 사용해서 순서대로 하나씩 출력하기
		for (int i = 0; i < nums.size(); i += 1) {
			System.out.println(nums.get(i));

		}

		for (Integer i : nums) {
			System.out.println(i);
		}

	}

}
