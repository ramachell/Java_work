package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import test.mypac.MemberDto;

public class MainClass09 {
	public static void main(String[] args) {

		String name = "에이콘";
		String addr = "강남역";

		// 아래의 insert() 메소드 활용해서 위 회원정보가 DB에 저장되도록
		MemberDto dto = new MemberDto();
		dto.setName(name);
		dto.setAddr(addr);
		insert(dto);

	}

	public static void insert(MemberDto dto) {
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
		//
		String name = dto.getName();
		String addr = dto.getAddr();
		// sql문 실행해줄 pstmt 객체
		PreparedStatement pstmt = null;
		try {
			// 실행할 미완성 sql문
			String sql = "insert into member values(member_seq.NEXTVAL,?,?)";
			// 미완성 sql 문 전달하면서 PreparedStatement 객체 참조값
			pstmt = conn.prepareStatement(sql);
			// PreparedStatement 객체의 메소드를 이용해서 sql 완성 ?에 값 바인딩
			// ?에 각각 대입하는것 1,2,3 은 순서
			pstmt.setString(1, name);
			pstmt.setString(2, addr);

			// sql 문 실행
			pstmt.executeUpdate();
			System.out.println("저장 했습니다.");

		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

}
