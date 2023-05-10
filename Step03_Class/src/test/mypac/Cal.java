package test.mypac;

public class Cal {

	public static double cal(double a, double b) {
		// a 기존 먹던 %
		// b 증가 or 감소량% ex) 10% or -10%

		double A = 0.01 * a;
		double B = 0.01 * b;

		double wholeafter = 1 + A * B;

		double dealper = A * (1 + B) / wholeafter;

		// return dealper;
		return 0.01 * a * (1 + .01 * b) / (1 + .01 * a * .01 * b) * 100;
	}

}
