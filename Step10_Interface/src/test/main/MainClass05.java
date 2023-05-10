package test.main;

import test.mypac.Calc;

public class MainClass05 {
	public static void main(String[] args) {
		Calc add1 = new Calc() {

			@Override
			public double execute(double num1, double num2) {
				return num1 + num2;
			}
		};

		// add1 을 간단히 한게 add2 (람다식)

		Calc add2 = (num1, num2) -> {
			return num1 + num2;
		};
		// 그리고 그걸 한번 더 간단히 한게 add3
		// 메소드의 내용이 {return A+B;} 이런식으로 한줄이면
		// 중괄호를 때고 그냥 A+B 하나만 남겨도됨

		Calc add3 = (num1, num2) -> num1 + num2;

		Calc plus = (a, b) -> a + b;
		Calc mult = (a, b) -> a * b;
		Calc div = (a, b) -> a / b;

//		Calc add3 = (num1, num2, num3) -> num1 + num2 + num3;
//		System.out.println(addd(1, 2, 3));
		System.out.println(addd(1, 2));

		MainClass05 m5 = new MainClass05();
		// static 아니기때문에 m5객체 생성이 필요함
		// MainCalss05. 으로 사용하면 안됨 (non-static)
		m5.addd(3, 4, 6);
		// static 이기떄문에 Main... 어쩌구 생략가능함
		MainClass05.addd(1, 5);

	}

	public int addd(int a, int b, int c) {
		return a + b + c;
	}

	public static int addd(int a, int b) {
		return a + b;
	}
}
