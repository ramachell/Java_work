package test.mypac;

// 메소드로 부터 두개의 실수를 전달받아 어떤 연산하고 결과 반한해주는 메소드
// 어떤 연산할지는 개발자가 알아서 정하기
@FunctionalInterface
public interface Calc {

	public double execute(double a, double b);
//	{
//		double result = num1 + num2;
//		return result;
//	}
}
