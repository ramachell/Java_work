package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.Member;

public class MainClass05 {
	public static void main(String[] args) {

		// 1. ArrayList 생성 Member객체 담기 members에
		List<Member> members = new ArrayList<>();
		// 2. 3명 회원정보 Member 객체에 각각담기
		Member mem1 = new Member(1, "김1번", "강남");
		Member mem2 = new Member(2, "김2번", "구로");
		Member mem3 = new Member(3, "김3번", "강북");

		// 3. Member 객체의 참조값을 members List 객체에 담기
		members.add(mem1);
		members.add(mem2);
		members.add(mem3);

		// 4. members List 객체에 담긴 내용 이용해서
		// 반복문 돌면서 출력해보기
		// 번호 :1, 이름 : 김1번, 주소 : 강남....
		members.forEach(t -> {
			System.out.println("번호 : " + t.num + ", 이름 : " + t.name + ", 주소 : " + t.addr);
		});

		for (int i = 0; i < members.size(); i++) {
			Member t = members.get(i);

			System.out.println("번호 : " + t.num + ", 이름 : " + t.name + ", 주소 : " + t.addr);
		}

	}

}
