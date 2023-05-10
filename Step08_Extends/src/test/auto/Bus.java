package test.auto;

public class Bus extends Car {
	// 부모 생성자에서 필요한 값을 자식생성자에서 받아서 전달해줘야 문법성립
	// 이건 Bus지만 Bus는 Car를 상속하기떄문에
	// Bus를 생성하면 자동으로 Car도 생성됨
	// 그런데 Car는 Engine을 참조값으로 받아야하므로
	// 아래와 같은 버스 생성자가 필요
	//

	public Bus(Engine engine) {
		super(engine);
		// super() = Car() 부모 생성자를 가리킴
	}

	// 메소드
	public void powerDrive() {
		if (this.engine == null) {
			System.out.println("Engine 없어서 Bus 못달려요");
			return;
		}
		System.out.println("Bus 달려요!");
	}

}
