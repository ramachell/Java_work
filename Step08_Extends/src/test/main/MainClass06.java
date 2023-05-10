package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

public class MainClass06 {
	public static void main(String[] args) {
		// 일반 핸드폰 (인터넷안됨)
		HandPhone p1 = new HandPhone();

		// 일반폰 그대로 안드로이드로 변경
		// AndroidPhone p2 = (AndroidPhone) p1;
		// p1에는 Android.. 에 대한게 없음 오류남
		Phone p3 = (Phone) p1;
		HandPhone p4 = (HandPhone) p3;
		p4.mobileCall();

		// p1은 핸드폰인데 폰으로 캐스팅해서 p2에 넣어도
		// p3에는 p1의 참조값이 담김
		// H p4 = (H) p3 할때 p4엔 사실 p1의 참조값이 들어감
		// 그래서 p3이 폰이었지만 핸드폰이 들어갈수있는것.

	}

}
