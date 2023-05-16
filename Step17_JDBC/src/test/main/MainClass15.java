package test.main;

import test.dao.MemberDao;
import test.mypac.MemberDto;

public class MainClass15 {
	public static void main(String[] args) {
		// 삭제할 회원의 정보
		int num = 2;
		MemberDto dto = new MemberDto();
		dto.setNum(num);

		// 회원 정보써서 삭제하고 성공하면 삭제했습니다 출력
		MemberDao.delete(dto.getNum());
	}

}
