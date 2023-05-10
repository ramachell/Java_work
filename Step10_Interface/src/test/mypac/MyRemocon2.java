package test.mypac;

public class MyRemocon2 implements Remocon {

	@Override
	public void up() {
		System.out.println("Remocon2 up");
	}

	@Override
	public void down() {
		System.out.println("Remocon2 down");
	}

	// but 나는 내가 사용할 편리한 메소드를 하나 더 만들고싶음

	public void reserve() {
		System.out.println("Remocon2 reserve");

	}
}
