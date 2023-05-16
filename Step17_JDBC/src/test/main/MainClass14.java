package test.main;

import test.dao.MemberDao;
import test.mypac.MemberDto;

public class MainClass14 {
	public static void main(String[] args) {
		// 수정할 회원의 정보
		int num = 1;
		String name = "김구라";
		String addr = "독산동";
		MemberDto dto = new MemberDto();
		dto.setName(name);
		dto.setAddr(addr);
		dto.setNum(num);

		MemberDao dao = new MemberDao();

		dao.update(dto);

		// 위 정보 이용해서 1번 회원의 정보를 수정하고 성공이면 "수정했습니다"가 출력되도록 해보세요
	}

}
