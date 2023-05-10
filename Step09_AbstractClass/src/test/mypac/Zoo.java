package test.mypac;

public class Zoo {
	// 클래스 안의 클래스 내부클래스
	public class Monkey {
		public void say() {
			System.out.println("원숭이 : 안녕");
		}

	}

	// 내부클래스
	public class Tiger {
		public void say() {
			System.out.println("호랑이 : 안녕");
		}
	}

	public Monkey getMonkey() {
		return new Monkey();

	}

	public Tiger getTiger() {
		return new Tiger();
	}
}
