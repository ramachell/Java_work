package test.mypac;

public class MyRemocon implements Remocon {

	@Override
	public void up() {
		System.out.println("올려요");
	}

	@Override
	public void down() {
		System.out.println("내려요");
	}

	public void aaa() {
		System.out.println("aaaa");
	}

}
