package test.auto;

/*
 *  접근 지정자 지정 범위
 *  
 *  public 어디서나 접근 가능
 *  protected 동일한 package 또는 상속관계에서 자식에서 접근가능
 *  default 동일한 package 안에서만 접근가능
 *  private 동일한 클래스 혹은 동일한 객체 안에서만 접근가능
 *  
 *  접근 지정자를 붙이는 위치
 *  
 *  1. 클래스를 선언할때
 *  2. 생성자
 *  3. 필드
 *  4. 메소드
 *  
 *  클래스는 public default 두가지만 가능 생략시 default
 */
public class Car {
	// 필드
	protected Engine engine;

	// Engine 객체를 생성자의 인자로 전달받는 생성자
	public Car(Engine engine) {
		this.engine = engine;
	}

	// 메소드
	public void drive() {
		if (this.engine == null) {
			System.out.println("Engine이 없어서 Car 못달려요!");
		} else {
			System.out.println("Car 달려요!");
		}

	}

}
