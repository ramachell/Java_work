package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

/*
 * 	지역 변수나 필드 앞에 선언 하는 data type 은 (참조 데이터 type)
 *  
 *  그안에 들어있는 참조값의 사용 설명서 라고 생각하면 된다
 *  
 *  그렇기 때문에 그 지역변수나 필드에 . 을 찍으면 사용 설명서에 며이된 기능만 사용 할 수 있다
 *  
 *  java 의 모든 객체는 다형성을 가질수있다
 *  
 *  다형성은 type이 여러개라는 의미 ex) p1은 핸드폰도되고 폰도되고 object도 됨
 */
public class MainClass02 {
	public static void main(String[] args) {
		// HandPhone 객체를 생성해서 나온 참조값을 HandPhone type 지역변수 p1 에 담기
		HandPhone p1 = new HandPhone();
		// HandPhone 객체를 생성해서 나온 참조값을 Phone type 지역변수 p2에 담기
		Phone p2 = new HandPhone();
		// HandPhone 객체를 생성해서 나온 참조값을 Object type 지역변수 p3에 담기
		Object p3 = new HandPhone();

	}

}
