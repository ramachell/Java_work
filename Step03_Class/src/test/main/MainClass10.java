package test.main;

import test.mypac.Square;

// test.mypac 패키지에 클래스 하나 더 만들기
// 사각형의 폭 높이(width height)를 필드에 저장
// 필드에 저장된 폭 높이를 이용해 사각형 넓이를 콘솔창에 출력하는 메소드
// 필드와 메소드는 non static
// 클래스명 필드명 메소드명 맘대로
public class MainClass10 {
	public static void main(String[] args) {
		Square sq1 = new Square();
		sq1.width = 30;
		sq1.height = 50;
		sq1.area();

		Square sq2 = new Square(50, 65);
		sq2.area();

	}
}
