package test.mypac;

// Member 객체에 회원 번호 이름 주소를 담기위해 Member 클래스를 만드려한다.
public class Member {

	public int num;
	public String name;
	public String addr;

	// 메소드
	public void showInfo() {
		System.out.println("번호 : " + this.num + " / 이름 : " + "" + "" + this.name + " / 주소 : " + addr);
	}
}
