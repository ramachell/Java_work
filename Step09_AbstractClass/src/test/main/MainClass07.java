package test.main;

import test.mypac.Car;

public class MainClass07 {
	public static void main(String[] args) {
		// 개발자가 코딩하는 위치
		useCar(new Car());
		// 좀더 빨리 달릴수는 없을까?
		// 그런데 남이 만들어논 drive() 메소드를 수정하는것은 불가능함
		useCar(new Car() {
			public void drive() {
				System.out.println("더 빨리 달려요");
			}
		});
	}

	// 누군가 미리 만들어 놓은 메소드
	public static void useCar(Car c) {
		c.drive();
		c.drive();
	}

}
