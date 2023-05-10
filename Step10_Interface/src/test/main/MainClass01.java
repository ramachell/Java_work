package test.main;

import test.mypac.MyRemocon;
import test.mypac.Remocon;

public class MainClass01 {
	public static void main(String[] args) {

		Remocon r1 = new MyRemocon();
		r1.up();
		r1.down();
		// r1.aaa();
		// up down 은 Remocon에 있지만 완성되지않았음
		// 하지만 MyRemocon에 Override 되있기때문에
		// MyRemocon 을 참조한 r1이 up down을 쓸수있는거임
		// 하지만 MyRemocon에만 있는 aaa()는
		// Remocon에선 존재하지 않기 떄문에 aaa()를 쓸수없음

	}

}
