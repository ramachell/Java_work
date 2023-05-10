package test.main;

import test.mypac.MyRemocon;
import test.mypac.MyRemocon2;
import test.mypac.Remocon;

public class MainClass02 {
	public static void main(String[] args) {
		// 다형성 확인
		MyRemocon r1 = new MyRemocon();
		Remocon r2 = r1;
		Object r3 = r1;

		MyRemocon2 r6 = new MyRemocon2();

		// 직접 클래스를 test.mypac 패키지에 파일로 만들어서
		// useRemocon() 메소드를 여기서 호출해 보세요
		useRemocon(r6);

		reserve(r6);

	}

	private static void reserve(MyRemocon2 r6) {
	}

	public static void useRemocon(Remocon r) {
		r.up();
		r.down();

	}

}
