package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.mypac.MemberDto;
import test.util.DBConnect;

public class MainClass10 {
	public static void main(String[] args) {
		// 수정할 회원 정보
		int num = 1;
		String name = "호빵";
		String addr = "독산동";
		MemberDto dto = new MemberDto();
		dto.setNum(num);
		dto.setName(name);
		dto.setAddr(addr);

		update(dto);

	}

	public static void update(MemberDto dto) {
		Connection conn = new DBConnect().getconn();
		// 아래꺼를 한줄로 줄인것
//		Connection conn;
//		DBConnect db = new DBConnect();
//		conn = db.getconn();
		//
		int num = dto.getNum();
		String name = dto.getName();
		String addr = dto.getAddr();
		// sql문 실행해줄 pstmt 객체
		PreparedStatement pstmt = null;
		try {
			// 실행할 미완성 sql문
			String sql = "update member set name=?,addr=? where num=?";
			// 미완성 sql 문 전달하면서 PreparedStatement 객체 참조값
			pstmt = conn.prepareStatement(sql);
			// PreparedStatement 객체의 메소드를 이용해서 sql 완성 ?에 값 바인딩
			// ?에 각각 대입하는것 1,2,3 은 순서
			pstmt.setString(1, name);
			pstmt.setString(2, addr);
			pstmt.setInt(3, num);

			// sql 문 실행
			pstmt.executeUpdate();
			System.out.println("저장 했습니다.");

		} catch (Exception e1) {
			e1.printStackTrace();
		}

	}

}
