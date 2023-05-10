package test.mypac;

public class Square {
	public int width;
	public int height;

	public void area() {
		System.out.println(this.width * this.height);
	}

	// 매개변수 넣은것도 만들기 (오버로딩)
	public Square() {
	}

	public Square(int a, int b) {
		width = a;
		height = b;
	}

}
