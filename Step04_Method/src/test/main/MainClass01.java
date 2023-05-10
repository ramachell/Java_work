package test.main;

import test.mypac.Airplane;
import test.mypac.Test;

public class MainClass01 {
	public static void main(String[] args) {
		// t에 Test 담기
		Test t = new Test() {
		};
		//
		t.walk();
		// return 타입이 int인 메소드 호출 a에 담기
		int a = t.getNumber();
		// return type String 메소드 호출 b에 담기
		String b = t.getGreeting();
		// return type Airplane 인 메소드 호출후 p1
		Airplane p1 = t.getPlane();
		// 이렇게 해도 동일 (getplane 메소드가 그렇게 정의되있음)
		Airplane p2 = new Airplane();

		p1.fly();

		// setNum() 메소드 호출
		// setName() 메소드 호출
		// setPlane() 메소드 호출
		String qq = new String();

		t.setNum(222222222);
		t.setName("effe");
		t.setPlane(new Airplane());

		t.doSomething(a, b, p2);
		t.send(new Airplane());
	}

}
