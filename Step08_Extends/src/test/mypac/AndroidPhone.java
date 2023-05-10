package test.mypac;

public class AndroidPhone extends HandPhone {
	// 생성자
	public AndroidPhone() {
		System.out.println("AndroidPhone 생성자 호출");
	}

	// 메소드
	public void doInternet() {
		System.out.println("인터넷을 해요");
	}

	public void showPlatform() {
		System.out.println("안드로이드 운영체제 입니다.");
	}

	// override 오버라이드 부모클래스의 메소드를 자식클래스에서 재정의
	@Override
	public void takePicture() {
		System.out.println("안드로이드 폰으로 사진을 찍어요");
		// super.takePicture();
	}

}
