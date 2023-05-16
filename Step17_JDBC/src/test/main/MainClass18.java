package test.main;

import java.util.Scanner;

import test.mypac.DeptDao;
import test.mypac.DeptDto;

public class MainClass18 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("검색할 회원 번호 입력:");
		// 정수 하나를 입력 받는다.
		int num = scan.nextInt();
		// MemberDao 객체를 이용해서 num 에 해당하는 회원정보를 얻어온다. (null 일수도 있다)
		DeptDto dto = new DeptDao().getData(num);
		// 만일 입력한 번호의 회원이 존재 한다면
		if (dto != null) {
			System.out.println(num + " 번 부서의 이름은 : " + dto.getDname() + " 주소는 : " + dto.getLoc());
		} else {
			System.out.println(num + " 번 부서는 존재 하지 않습니다!");
		}
		DeptDto dto2 = new DeptDto(60, "aadd", "aaff");
//		DeptDao.insert(dto2);
//		DeptDao.delete(60);
		// git 테스트용 추가 주석
		// git 테스트용 추가 주석2

	}
}
