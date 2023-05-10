package test.mypac;

public abstract class Weapon {
	// 무기 작동을 준비하는 메소드
	public void prepare() {
		System.out.println("무기 작동을 준비 합니다.");
	}

	public abstract void attack();

	// 메소드의 모양만 정의하고 실제 구현은 안함
	// 미완성된 추상 메소드를 만들때엔 abstract 명령어가 필요함
}
