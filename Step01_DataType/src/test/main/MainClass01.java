package test.main;
/*
 *  [ Java 기본 데이터 type ]
 *  
 *  1. 숫자형
 *  
 *  정수형 : byte, short, int, long
 *  
 *  - byte 변수명;  // -128 ~ 127
 *  - short 변수명;  // -32768 ~ 32767
 *  - int  변수명; // -2,147,483,648 ~ 2,147,483,647
 *  - long 변수명; // -9223372036854775808 ~ 9,223,372,036,854,775,807
 *  
 *  실수형 : float, double
 *  
 *  - float 변수명; // 1.40129846432481707e-45 ~ 3.40282346638528860e+38
 *  - double 변수명; //4.94065645841246544e-324d ~ 1.79769313486231570e+308d
 */

public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		// 정수형 변수 선언하고 값 대입하기
		byte iByte = 10;
		short iShort = 10;
		int iInt = 10000;
		long iLong = 10;
		
		/*
		 * int에 byte 를 넣으면 int가 더 크기때문에 문제가 발생하지않음
		 * 근데 반대에서 int 의 크기가 byte보다 클경우 문제가 발생함 
		 */
		
		int tmp = iShort;
		
		// casting 하면 됨
		iShort = 1024+127;
		System.out.println(iShort);
		byte tmp2 = (byte)iShort;
		System.out.println(tmp2);
		float num1 = 10.1f;
		// float num10 = 10.1; 뒤에 안붙이면 알아서 d로 판단함
		double num2 = 10.2d;
		double num3 = 10.3;
		double tmp3=num1;
		
		float tmp4=(float)num2;
		System.out.println("main 메소드가 종료 됩니다.");
	}
}
