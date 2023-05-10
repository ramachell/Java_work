package test.main;

/*
 *  [ 기본 data type의 참조 data type ]
 *  
 *  byte	: Byte
 *  short 	: Short
 *  int		: Integer
 *  long	: Long
 *  
 *  float	: Float
 *  double	: Double
 *  
 *  char	: Character
 *  boolean	: Boolean
 *  
 *  때로는 기본 데이터 type 의 참조데이터 type 이 필요할때가 있다.
 *  기본 데이터 type 을 객체의 포장(boxing) 하는 형태이다
 *  boxing 과 unboxing 은 자동으로 되기 때문에 프로그래머가 신경쓸 필요x
 *  
 */

public class MainClass01 {
	public static void main(String[] args) {
		// 기본 data type
		int num1 = 10;
		// 참조 data type
		Integer num2 = 10;

		// 참조 데이터 type 지만 기본 data type 처럼 사용가능
		int result1 = num2 + 1;
		int result2 = num1 + num2;
		Integer result3 = num1 + num2;

		// Integer 클래스의 static 메소르를 사용해서
		// 문자 "999"를 숫자 999로 변환할수있다

		int result4 = Integer.parseInt("999");

	}

}
