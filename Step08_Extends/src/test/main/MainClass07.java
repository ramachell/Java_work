package test.main;

import test.auto.Bus;
import test.auto.Car;
import test.auto.Engine;

public class MainClass07 {
	public static void main(String[] args) {
		/*
		 *  Car 클래스는 default 생성자가 없고
		 *  Engine type의 참조값을 전달해 줘야지만 호출되는 생성자를 갖고있음
		 *  Car 객체를 생성하기 위해서는 반드시 Engine type 넣어줘야함
		 */

		Car car1 = new Car(new Engine());
		car1.drive();

		Bus bus1 = new Bus(new Engine());
	}

}
