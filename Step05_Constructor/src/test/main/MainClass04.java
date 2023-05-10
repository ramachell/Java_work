package test.main;

import java.util.Random;

public class MainClass04 {
	public static void main(String[] args) {
		/* 
		 *	java.util 패키지에 있는 Random 클래스 사용해보기
		 */

		Random r = new Random();

		int ranNum = r.nextInt(0, 1);
		System.out.println(ranNum);

		int a = 33;
		int b = a >>> 2;

	}

}
