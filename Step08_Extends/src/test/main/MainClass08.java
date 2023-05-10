package test.main;

import test.auto.Bus;
import test.auto.Engine;

public class MainClass08 {
	public static void main(String[] args) {
		Bus bus1 = new Bus(new Engine());
		bus1.drive();
		bus1.powerDrive();

		// null을 전달해도 문법은 되고 생성도 잘 되지만
		// 만약 Engine 객체가 필요하게되면 오류가남 (메소드라던지)
		Bus bus2 = new Bus(null);
		bus2.drive();
		bus2.powerDrive();

	}
}
