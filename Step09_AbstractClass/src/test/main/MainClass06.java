package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;

public class MainClass06 {
	public static void main(String[] args) {
		// 아래에 있는 useWeapon() 메소드를 호출하려면 Weapon type의 참조값이 필요하다

		Weapon w1 = new MyWeapon();
		useWeapon(w1);
		// 여기서 w1 이라는걸 따로 만들지않고 MyWeapon 도 안쓰고 바로 할수없을까?

		// {} 이거는 클래스 이름이없는 익명의 클래스다 extends Weapon 이 된
		// anonymous inner class
		// Weapon이 추상이기때문에 Override 한 거지 일반 클래스도 사용가능
		Weapon w2 = new Weapon() {
			@Override
			public void attack() {

				System.out.println("공격하자");
			}
		};
		useWeapon(w2);

		useWeapon(new Weapon() {
			@Override
			public void attack() {
				System.out.println("공격하자2");
			}
		});

	}

	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
		w.attack();
	}

}
