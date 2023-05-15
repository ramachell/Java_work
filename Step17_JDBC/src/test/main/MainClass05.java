package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * JDBC (Java DataBase Connectivity)
 * 	
 * DataBase 에 연결해서 SELECT, INSERT, UPDATE, DELETE 작업하기
 * 
 * Oracle 에 연겨랗기 위해서는 드라이버 클래스가 들어있는 ojdbc6.jar 파일을 사용할수 있도록 설정해줘야한다
 * 
 *  프로젝트에 마우스 우클릭 build path - configure Build Path - Libraries 탭
 *  classPath 선택 add external jar - 받은 ojdbc6.jar 선택후 apply 
 */
public class MainClass05 {
	public static void main(String[] args) {
		// DB 연결객체를 담을 지역 변수 만들기
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
		// 4번 회원 삭제
		int num = 4;
		// sql문 실행해줄 pstmt 객체
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
			System.out.println("저장 했습니다.");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
