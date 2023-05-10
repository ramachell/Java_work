package test.mypac;

public class Car {
	/*
	 * [필드 정의하기] 클래스의 {} 중괄호 안에 아래와 같은 형식으로 필드를 정의할수있다 
	 * 초기 값을 부여하지 않으면 기본값이 들어간다 int
	 * 의 기본값은 0 boolean 의 기본값은 false type 의 기본값은 null
	 * 
	 *  접근 지정자 data type       필드명 = 초기값
	 */

	public String name;
	public int price;

	public void drive() {
		System.out.println(this.name + " : 달려요");
	}

	public void showInfo() {
		System.out.println("저의 이름은 " + this.name + " 이고 가격은 " + this.price + " 만원 입니다.");

	}

}
