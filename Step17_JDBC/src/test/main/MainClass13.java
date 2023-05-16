package test.main;

import test.mypac.MemberDao;
import test.mypac.MemberDto;

public class MainClass13 {
	public static void main(String[] args) {
		// 새로 추가할 회원정보
		String name = "누구게";
		String addr = "어디게";
		MemberDto dto = new MemberDto();
		dto.setName(name);
		dto.setAddr(addr);

		// 위의 정보를 DB에 저장하고 저장이 성공되었다면 "저장했습니다"를 콘솔에 출력하는 기능 만들고 싶다면

		MemberDao dao = new MemberDao();
		dao.insert(dto);
	}

}
