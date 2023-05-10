package test.main;

import java.util.Random;

public class QuizMain3 {
	public static void main(String[] args) {
		/*
		 * 3. 	우연히 3개가 모두 같을때에는 "당첨됐습니다!" 를 출력하고
		 * 		하나라도 다르면 꽝을 출력하도록 해보세요
		 *		ex) 
		 * 		cheery | apple | cherry "꽝"
		 * 		7 | apple | melon		"꽝"
		 * 		7 | 7 | 7				"당첨됐습니다."
		 * 
		 */

		String[] str = { "cherry", "apple", "banana", "melon", "7" };

		Random ran = new Random();

		int[] ints = new int[3];
		for (int i = 0; i < ints.length; i++) {
			ints[i] = ran.nextInt(5);
		}

		System.out.print(str[ints[0]] + " | " + str[ints[1]] + " | " + str[ints[2]]);
		System.out.println();
		// 당첨 여부 판단
		boolean prize = ints[0] == ints[1] && ints[1] == ints[2];

		System.out.println(prize ? "당첨됐습니다." : "꽝");

		int[] ints2 = new int[9];

		for (int i = 0; i < ints2.length; i++) {
			ints2[i] = ran.nextInt(5);
			System.out.print(str[ints2[i]]);
			if (i < 8) {
				System.out.print(" | ");
			}
		}

	}

}
