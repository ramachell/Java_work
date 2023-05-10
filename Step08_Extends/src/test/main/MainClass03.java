package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

public class MainClass03 {
	public static void main(String[] args) {

		// HandPhone 객체를 생성해서 나온 참조값을 HandPhone type 지역변수 p1 에 담기
		HandPhone p1 = new HandPhone();
		// HandPhone 객체를 생성해서 나온 참조값을 Phone type 지역변수 p2에 담기
		Phone p2 = p1;
		// HandPhone 객체를 생성해서 나온 참조값을 Object type 지역변수 p3에 담기
		Object p3 = p1;

		// 자식 객체의 참조값은 부모 type 변수나 필드에 자연스럽게 담긴다
	}

}
