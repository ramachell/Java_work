package test.main;

import test.mypac.Member;

public class MainClass02 {
	public static void main(String[] args) {
		// Member 객체를 생성
		Member m1 = new Member();
		m1.num = 3;
		m1.name = "김구라";
		m1.addr = "행신동";
		// 필드를 직접 참조해서 회원 정보를 저장하기
		new Member(1, "a", "b").printInfo();
		Member m2 = new Member(2, "ㅇ", "d");

		m2.printInfo();
		m2.num = 7;
	}
}