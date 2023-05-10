package test.mypac;

public class Member {

	public int num;
	public String name;
	public String addr;

	public Member() {
	}

	public Member(int num, String name, String addr) {
		this.num = num;
		this.name = name;
		this.addr = addr;
	}

	public void printInfo() {
		System.out.println("번호 : " + num + " 이름 " + name + " 주소 " + addr);
	}

}
