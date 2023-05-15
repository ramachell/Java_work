package mypac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
public class Ora {

	public static void select(String table) {

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
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			// 실행할 sql문

			// sql을 입력한 prepareStatement 객체의 참조값 얻어오기
			pstmt = conn.prepareStatement("select * from " + table + " order by num");
			// sql을 실행하고 나온 결과값을 ResultSet 객체에 넣기
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int num = rs.getInt("num");
				String name = rs.getString("name");
				String addr = rs.getString("addr");
				// 콘솔창에 출력해보기

				System.out.println(num + " | " + name + " | " + addr);
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}

	}
}
