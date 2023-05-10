package test.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Main3 {
	public static void main(String[] args) {
		Random ran = new Random();
		List<Integer> nums = new ArrayList<>();

		HashMap<Integer, Integer> lotto = new HashMap<>();
		for (; lotto.size() < 6;) {
			lotto.put(ran.nextInt(1, 46), 0);
		}

		System.out.println(lotto.keySet());
		nums.addAll(lotto.keySet());

		Collections.sort(nums);
		System.out.println(nums);

		HashMap<Integer, Integer> lotto2 = new HashMap<>();

		System.out.println(lotto2.put(4, 0));
		lotto2.put(4, 4);
		System.out.println(lotto2.remove(3, 0));
		System.out.println(lotto2);

	}

}
