package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;

/*
 * [ 추상 클래스 (abstract) ]
 * 
 * class 예약어 앞에 abstract 를 명시해서 클래스를 정의함
 * 형태만 정의되고 실제 구현은 되지않은 메소드가 존재할수있음
 * 형태만 정의된 메소드를 만들때는 abstract 예약어를 붙여서 메소드를 정의
 * 생성자는 존재하지만 단독으로 객체 생성은 불가능 AAA a = new AAA 가 안됨
 * 추상클래스 Type의 참조값이 필요하다면 추상클래스를 상속받은 자식클래스를 정의해서 객체 생성한다 (오버라이딩)
 * 추상클래스를 상속받은 자식 클래스는 부모의 추상 메소드를 모두 오버라이드 해야한다(재정의) 
 */

public class MainClass01 {
	public static void main(String[] args) {
		Weapon w1 = new MyWeapon();

	}
}
