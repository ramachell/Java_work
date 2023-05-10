package test.main;

import test.mypac.Car;

public class MainClass05 {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.name = "소나타";
		car1.price = 1000;
		car1.drive();

		// 메소드 호출했을때 "저의 이름은 소나타 이고 가격은 1000 만원 입니다."
		// 되도록 showInfo 작성해보기
		car1.showInfo();

		int car2 = new Car().price = 3000;

	}

}
