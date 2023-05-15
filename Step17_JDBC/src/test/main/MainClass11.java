package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.mypac.MemberDto;
import test.util.DBConnect;

public class MainClass11 {
	public static void main(String[] args) {
		int num = 3; // 삭제할 번호라고 가정
		MemberDto dto = new MemberDto();
		dto.setNum(num);

		// 아래의 delete() 메소드 이용해서 삭제
		delete(num);
	}

	public static void delete(int num) {
		Connection conn = new DBConnect().getconn();

		PreparedStatement pstmt = null;
		try {
			// 실행할 미완성 sql문
			String sql = "delete from member where num=?";
			// 미완성 sql 문 전달하면서 PreparedStatement 객체 참조값
			pstmt = conn.prepareStatement(sql);
			// PreparedStatement 객체의 메소드를 이용해서 sql 완성 ?에 값 바인딩
			// ?에 각각 대입하는것 1,2,3 은 순서
			pstmt.setInt(1, num);

			// sql 문 실행
			pstmt.executeUpdate();
			System.out.println("삭제 했습니다.");

		} catch (Exception e1) {
			e1.printStackTrace();
		}

	}

}
