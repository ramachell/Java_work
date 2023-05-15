package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import test.mypac.Member;

public class MainClass07 {
	public static void main(String[] args) {
		// 추가할 회원의 정보
		String name = "주뎅이";
		String addr = "봉천동";
		Member mem = new Member();
		mem.num = 4;
		mem.name = name;
		mem.addr = addr;

		insert(mem);

		// 아래의 메소드를 호출해서 위의 회원정보가 DB에 저장되도록 프로그래밍 해보세요

	}

	public static void insert(Member mem) {
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
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		// msg1, msg2, msg3 에 각각 입력
		int num = mem.num;
		String name = mem.name;
		String addr = mem.addr;
		// sql문 실행해줄 pstmt 객체
		PreparedStatement pstmt = null;
		try {
			// 실행할 미완성 sql문
			String sql = "insert into member values(?,?,?)";
			// 미완성 sql 문 전달하면서 PreparedStatement 객체 참조값
			pstmt = conn.prepareStatement(sql);
			// PreparedStatement 객체의 메소드를 이용해서 sql 완성 ?에 값 바인딩
			// ?에 각각 대입하는것 1,2,3 은 순서
			pstmt.setInt(1, num);
			pstmt.setString(2, name);
			pstmt.setString(3, addr);

			// sql 문 실행
			pstmt.executeUpdate();
			System.out.println("저장 했습니다.");

		} catch (Exception e1) {
			e1.printStackTrace();
		}

		// mem에 담긴 정보를 이용해서 이 메소드 호출시 db에 저장되도록

	}
}