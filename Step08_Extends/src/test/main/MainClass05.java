package test.main;

import test.mypac.AndroidPhone;

public class MainClass05 {
	public static void main(String[] args) {
		// AndroidPhone 객체 생성해서 참조값을 AndroidPhone type p1 이란 지역변수에 담기
		AndroidPhone p1 = new AndroidPhone();
		p1.call(); // Phone
		p1.mobileCall(); // HandPhone
		p1.takePicture(); // HandPhone
		p1.doInternet(); // Andorid....
		p1.showPlatform(); // Andorid....
	}

}
