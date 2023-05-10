package test.mypac;

/* [메소드를 만들때 고려할것]
 * 1. 접근 지정자 (모르면 public)
 * 2. static or non static (모르면 non static)
 * 3. 리턴 type (모르면 void)
 * 4. 메소드명
 * 5. 메소드에 전달할 인자의 갯수와 type
 */

public class Test {
	public void walk() {
		System.out.println("걸어요!");
	}

	public int getNumber() {
		int num = 10;
		return num;
	}

	public String getGreeting() {
		String greet = "안녕하세요";
		return greet;
	}

	public Airplane getPlane() {
		Airplane plane = new Airplane();
		return plane;
	}

	// int type 를 메소드의 인자로 전달받는 메소드
	public int setNum(int num) {
		return (int) num;
	}

	// String type 를 인자로 전달받는 메소드
	public String setName(String name) {
		return "ada";

	}

	// Airplane type 를 인자로 전달받는 메소드
	public Airplane setPlane(Airplane plane) {
		return plane;
	}

	// int String Airplane 3개 받는 메소드
	public void doSomething(int num, String name, Airplane plane) {
	}

	public void send() {
		System.out.println("전송해요");
	}

	public void send(int num) {
		System.out.println(num + "를 전송해요");
	}

	public void send(String name) {
		System.out.println(name + "를 전송해요");
	}

	public void send(Airplane plane) {
		System.out.println("비행기를 전송해요");
	}
}
