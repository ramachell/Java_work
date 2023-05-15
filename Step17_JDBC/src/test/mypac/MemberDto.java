package test.mypac;

public class MemberDto {
	// 필드의 접근 지정자를 private로
	private int num;
	private String name;
	private String addr;

	public MemberDto() {
		// TODO Auto-generated constructor stub
	}

	public MemberDto(String name, String addr) {

	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

}
