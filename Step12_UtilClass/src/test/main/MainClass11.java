package test.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainClass11 {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(10);
		nums.add(20);
		nums.add(30);

		// type 확인
		Collection<Integer> nums2 = nums;
		// 이 nums를 바로 HashSet 생성자에 넣어서 바로 중복제거 가능
		Set<Integer> set1 = new HashSet<>(nums);
		// 중복 제거된 set1 사용해서 ArrayList 새로 생성
		List<Integer> set2 = new ArrayList<>(set1);

		System.out.println(nums);
		System.out.println(set1);
	}

}
