package test.main;

import test.mypac.Weapon;

public class MainClass05 {
	// inner class 에 한해서 static 사용 가능
	// 이걸쓰는이유 SeaWeapon.java 파일을 따로 안만들고 안에서 해결하고플때
	static class SeaWeapon extends Weapon {

		@Override
		public void attack() {
			System.out.println("바다를 공격 합니다.");
		}
	}

	public static void main(String[] args) {
		// 바다를 공격하는 무기를 만들어서 사용하고 싶다.
		Weapon w1 = new SeaWeapon();
		w1.prepare();
		w1.attack();

		// 우주를 공격하는 무기를 만들어서 이용하고싶다.
		class SpaceWeapon extends Weapon {

			@Override
			public void attack() {
				System.out.println("우주를 공격 합니다.");
			}
		}
		Weapon w2 = new SpaceWeapon();
		w2.prepare();
		w2.attack();
	}

}
