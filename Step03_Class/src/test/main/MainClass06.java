package test.main;

import test.mypac.MyUtil;

public class MainClass06 {
	public static void main(String[] args) {
		// MyUtil 클래스의 send메소드 사용해보기
		MyUtil.send();
		// MyUtil 클래스의 version 필드 참조
		String v = MyUtil.version();

		System.out.println("오잉?");
		System.out.println((double) System.currentTimeMillis() / 1000 / 60 / 60 / 24 / 365.2475);

		System.out.println(MainClass06.max(3, 6));

		System.out.println(MainClass06.div(3, 8));
	}

	static int max(int a, int b) {
		a = 5;
		b = 3;
		if (a > b)
			return a;
		else
			return b;
	}

	static float div(int a, int b) {
		float r = (float) a / b;
		return r;
	}

}
