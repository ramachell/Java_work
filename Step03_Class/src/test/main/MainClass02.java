package test.main;

import test.mypac.Car;

public class MainClass02 {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = car1;
		Car car3 = null;

		car1.name = "아반떼";
		String a = car1.name;
		String b = car2.name;

		car1.drive();
		car2.drive();
	}

}
