package test.mypac;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.util.DBConnect;

/*
 * Data Access Object 만들어 보기
 * 
 * -DB 에 insert, update, delete, select 작업을 대신해 주는 객체를 생성할 클래스 설계하기
 */

public class MemberDao {

	// 인자로 전달되는 번호에 해당하는 회원 한명의 정보를 리턴하는 메소드
	public MemberDto getData(int num) {
		MemberDto dto = null;
		// 필요한 객체를 담을 지역 변수를 미리 만들기
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		// insert, update, delete 작업을 통해서 변화된(추가, 수정, 삭제) row 의 갯수를 담을 변수

		try {
			// Connection 객체의 참조값 얻어오기
			conn = new DBConnect().getconn();
			// 실행할 sql 문
			String sql = "select * from member where num = ?";
			// sql 문을 대신 실행해줄 PreparedStatement 객체의 참조값 얻어오기
			pstmt = conn.prepareStatement(sql);
			// sql 문이 ? 가 존재하는 미완성이라면 여기서 완성한다.
			pstmt.setInt(1, num);
			// executeQuery()로 rs에 받기
			rs = pstmt.executeQuery();// 수행하고 리턴되는값을 변수에 담는다.

			while (rs.next()) {
				dto = new MemberDto();
				dto.setNum(rs.getInt("num"));
				dto.setName(rs.getString("name"));
				dto.setAddr(rs.getString("addr"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally { // 예외가 발생을 하던 안하던 실행이 보장되는 블럭에서 마무리 작업
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
				if (rs != null) {
					rs.close();
				}
			} catch (Exception e) {
			}
		}

		return dto;
	};

	// 전체 회원 정보 리턴하는 메소드
	public List<MemberDto> getList() {
		List<MemberDto> list = new ArrayList<>();

		// 필요한 객체를 담을 지역 변수를 미리 만들기
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		// insert, update, delete 작업을 통해서 변화된(추가, 수정, 삭제) row 의 갯수를 담을 변수

		try {
			// Connection 객체의 참조값 얻어오기
			conn = new DBConnect().getconn();
			// 실행할 sql 문
			String sql = "select * from member order by num";
			// sql 문을 대신 실행해줄 PreparedStatement 객체의 참조값 얻어오기
			pstmt = conn.prepareStatement(sql);
			// sql 문이 ? 가 존재하는 미완성이라면 여기서 완성한다.

			// executeQuery()로 rs에 받기
			// 수행하고 리턴되는값을 변수에 담는다.
			rs = pstmt.executeQuery();

			while (rs.next()) {

				MemberDto dto = new MemberDto();
				dto.setNum(rs.getInt("num"));
				dto.setName(rs.getString("name"));
				dto.setAddr(rs.getString("addr"));

				list.add(dto);

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally { // 예외가 발생을 하던 안하던 실행이 보장되는 블럭에서 마무리 작업
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
				if (rs != null) {
					rs.close();
				}
			} catch (Exception e) {
			}
		}

		return list;
	}

	// 회원 정보 업데이트
	public static boolean update(MemberDto dto) {
		// 필요한 객체를 담을 지역 변수를 미리 만들기
		Connection conn = null;
		PreparedStatement pstmt = null;
		// insert, update, delete 작업을 통해서 변화된(추가, 수정, 삭제) row 의 갯수를 담을 변수
		int rowCount = 0; // 초기값을 0으로 부여한다.
		try {
			// Connection 객체의 참조값 얻어오기
			conn = new DBConnect().getconn();
			// 실행할 sql 문
			String sql = "update member set name = ? , addr = ? where num = ?";
			// sql 문을 대신 실행해줄 PreparedStatement 객체의 참조값 얻어오기
			pstmt = conn.prepareStatement(sql);
			// sql 문이 ? 가 존재하는 미완성이라면 여기서 완성한다.
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			pstmt.setInt(3, dto.getNum());

			// insert or update or delete 문을 실제 수행한다. 변화된 row 의 갯수가 리턴된다.
			rowCount = pstmt.executeUpdate();// 수행하고 리턴되는값을 변수에 담는다.
		} catch (Exception e) {
			e.printStackTrace();
		} finally { // 예외가 발생을 하던 안하던 실행이 보장되는 블럭에서 마무리 작업
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		// 변화된 row 의 갯수가 0 보다 크면 작업 성공
		if (rowCount > 0) {
			System.out.println("수정했습니다.");
			return true;
		} else {// 그렇지 않으면 작업 실패
			return false;
		}
	}

	// 회원 한명 정보 삭제하는 메소드 (num 만 입력해줌)
	public static boolean delete(int num) {
		// 필요한 객체를 담을 지역 변수를 미리 만들기
		Connection conn = null;
		PreparedStatement pstmt = null;
		// insert, update, delete 작업을 통해서 변화된(추가, 수정, 삭제) row 의 갯수를 담을 변수
		int rowCount = 0; // 초기값을 0으로 부여한다.
		try {
			// Connection 객체의 참조값 얻어오기
			conn = new DBConnect().getconn();
			// 실행할 sql 문
			String sql = "delete from member where num = ?";
			// sql 문을 대신 실행해줄 PreparedStatement 객체의 참조값 얻어오기
			pstmt = conn.prepareStatement(sql);
			// sql 문이 ? 가 존재하는 미완성이라면 여기서 완성한다.
			pstmt.setInt(1, num);
			// insert or update or delete 문을 실제 수행한다. 변화된 row 의 갯수가 리턴된다.
			rowCount = pstmt.executeUpdate();// 수행하고 리턴되는값을 변수에 담는다.
		} catch (Exception e) {
			e.printStackTrace();
		} finally { // 예외가 발생을 하던 안하던 실행이 보장되는 블럭에서 마무리 작업
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		// 변화된 row 의 갯수가 0 보다 크면 작업 성공
		if (rowCount > 0) {
			System.out.println("삭제했습니다");
			return true;
		} else {// 그렇지 않으면 작업 실패
			System.out.println("삭제 안됐습니다.");
			return false;
		}
	}

	// 회원 한명의 정보를 저장하고 해당 작업의 성공 여부를 리턴해주는 메소드
	public static boolean insert(MemberDto dto) {

		// 필요한 객체를 담을 지역 변수를 미리 만들기
		Connection conn = null;
		PreparedStatement pstmt = null;
		// insert, update, delete 작업을 통해서 변화된(추가, 수정, 삭제) row 의 갯수를 담을 변수
		int rowCount = 0; // 초기값을 0으로 부여한다.
		try {
			// Connection 객체의 참조값 얻어오기
			conn = new DBConnect().getconn();
			// 실행할 sql 문
			String sql = "insert into member values(mem_seq.nextval,?,?)";
			// sql 문을 대신 실행해줄 PreparedStatement 객체의 참조값 얻어오기
			pstmt = conn.prepareStatement(sql);
			// sql 문이 ? 가 존재하는 미완성이라면 여기서 완성한다.
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());

			// insert or update or delete 문을 실제 수행한다. 변화된 row 의 갯수가 리턴된다.
			rowCount = pstmt.executeUpdate();// 수행하고 리턴되는값을 변수에 담는다.
		} catch (Exception e) {
			e.printStackTrace();
		} finally { // 예외가 발생을 하던 안하던 실행이 보장되는 블럭에서 마무리 작업
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		// 변화된 row 의 갯수가 0 보다 크면 작업 성공
		if (rowCount > 0) {
			return true;
		} else {// 그렇지 않으면 작업 실패
			return false;
		}

	}
}
