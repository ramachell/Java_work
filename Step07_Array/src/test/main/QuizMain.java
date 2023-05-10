package test.main;

import java.util.Random;

public class QuizMain {
	public static void main(String[] args) {
		/*
		 *  1. run 했을때 
		 *  cherry, apple, banana, melon, 7
		 *  5개의 문자열 중에서 랜덤하게 1개 출력되게 해보세요
		 */

		String[] str = { "cherry", "apple", "banana", "melon", "7" };

		Random ran = new Random();

		System.out.println(str[ran.nextInt(5)]);

	}

}
