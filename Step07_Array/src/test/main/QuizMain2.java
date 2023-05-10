package test.main;

import java.util.Random;

public class QuizMain2 {
	public static void main(String[] args) {
		/*
		 * 2. run 했을때
		 * 5개의 문자열 중에서 3개가 한줄에 한번에 출력되게 해보세요.
		 * ex) 
		 * cheery | apple | cherry
		 * 7 | apple | melon
		 * 7 | 7 | 7
		 * 
		 */

		String[] str = { "cherry", "apple", "banana", "melon", "7" };

		Random ran = new Random();

		System.out.print(str[ran.nextInt(5)] + " | " + str[ran.nextInt(5)] + " | " + str[ran.nextInt(5)]);

		System.out.println("");
		// for 사용
		for (int i = 0; i < 3; i++) {
			System.out.print(str[ran.nextInt(5)]);
			if (i < 2) {
				System.out.print(" | ");

			}

		}
	}
}
