package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import test.mypac.Member;

public class MainClass08 {
	public static void main(String[] args) {
		// 수정할 회원의 정보라고 가정
		int num = 1;
		String name = "이정호";
		String addr = "아현동";

		Member mem1 = new Member();
		mem1.num = 1;
		mem1.name = name;
		mem1.addr = addr;
		update(mem1);

	}

	public static void update(Member mem) {
		// Member 객체에 담긴 정보를 이용해서 회원 정보를 수정하도록 해보세요.
		Connection conn = null;

		try {
			// 오라클 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 접속할 DB 의 정보 @아이피주소:port번호:db이름
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			// 계정 비밀번호를 이용해서 Connection 객체의 참조값 얻어오기
			conn = DriverManager.getConnection(url, "scott", "tiger");
			// 예외가 발생하지 않고 여기까지 실행순서가 내려오면 접속 성공이다.
			System.out.println("Oracle DB 접속 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
		int num = mem.num;
		String name = mem.name;
		String addr = mem.addr;
		// sql문 실행해줄 pstmt 객체
		PreparedStatement pstmt = null;
		try {
			// 실행할 미완성 sql문
			String sql = "update member set name = ?, addr = ? where num=?";
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

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
