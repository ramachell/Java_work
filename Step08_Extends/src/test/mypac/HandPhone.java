package test.mypac;

// 이미 존재하는 Phone 상속받기(extends)

public class HandPhone extends Phone {

	// 생성자
	public HandPhone() {
		System.out.println("HandPhone 생성자 호출");
	}

	// 메소드
	public void mobileCall() {
		System.out.println("이동중에 전화를 걸어요");
	}

	// 사진 찍는 메소드
	public void takePicture() {
		System.out.println("사진을 찍어요");
	}

}
