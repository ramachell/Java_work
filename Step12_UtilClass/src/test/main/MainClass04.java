package test.main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import test.mypac.Car;

public class MainClass04 {
	public static void main(String[] args) {
		// 1. Car type 을 저장할수 있는 ArrayList 객체를 생성해서
		// 참조값을 List 인터페이스 type 지역변수 cars에 넣기
		List<Car> cars = new ArrayList<>();

		// 2. Car 객체(3개) 생성해서 List 객체에 저장
		cars.add(new Car("1번차"));
		cars.add(new Car("2번차"));
		cars.add(new Car("3번차"));
		// 3. 일반 for 문을 이용해서 List 객체에 저장된 모든 Car 객체의
		// drive()메소드를 순서대로 호출
		for (int i = 0; i < cars.size(); i++) {
			cars.get(i).drive();
		}

		// 4. 확장 for 문을 이용해서 List 객체에 저장된 모든 Car 객체의
		// drive() 메소드 호출
		for (Car car : cars) {
			car.drive();
		}

		// 5. Consumer 인터페이스를 활용해서 List 객체에 저장된 모든
		// 어쩌구 저쩌구 drive() 호출
		cars.forEach(new Consumer<Car>() {
			@Override
			public void accept(Car t) {
				t.drive();
			}
		});

		cars.forEach(t -> {
			t.drive();
		});

	}

}
