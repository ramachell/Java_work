package test.main;

public class MainClass02 {
	double num1 = 10;
	// 참조 data type
	Double num2 = 10d;

	// 참조 데이터 type 지만 기본 data type 처럼 사용가능
	double result1 = num2 + 10;
	double result2 = num1 + num2;
	Double result3 = num1 + num2;

	// Double 클래스의 static 메소르를 사용해서
	// 문자 "999"를 숫자 999로 변환할수있다

	double result4 = Double.parseDouble("999");

}
