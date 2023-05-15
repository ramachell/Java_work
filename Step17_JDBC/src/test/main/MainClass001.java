package test.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MainClass001 extends JFrame {
	static JTextField input1;
	static JTextField input2;
	static JTextField input3;

	public MainClass001(String title) {
		super(title);

		setBounds(600, 300, 700, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		input1 = new JTextField(10);
		input2 = new JTextField(10);
		input3 = new JTextField(10);

		JButton add = new JButton("DB 추가하기");

		JButton view = new JButton("mem DB 보기");

		JButton delete = new JButton("삭제하기");

		JPanel p1 = new JPanel();

		p1.add(input1);
		p1.add(input2);
		p1.add(input3);
		p1.add(add);
		p1.add(view);
		p1.add(delete);

		add(p1, BorderLayout.NORTH);
		p1.setBackground(Color.yellow);

		JTextArea ta = new JTextArea();
		add(ta, BorderLayout.CENTER);

		setVisible(true);

		add.addActionListener((e5) ->

		{
			Connection conn = null;
			String msg1 = input1.getText();
			String msg2 = input2.getText();
			String msg3 = input3.getText();

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
			int num = Integer.parseInt(msg1);
			String name = msg2;
			String addr = msg3;
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
				JOptionPane.showMessageDialog(this, "DB 입력이 완료되었습니다");

			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});

		view.addActionListener(e -> {

			Connection conn = null;
			String msg1 = input1.getText();
			String msg2 = input2.getText();
			String msg3 = input3.getText();

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

			// sql문 실행해줄 pstmt 객체
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				ta.setText("");
				// 실행할 미완성 sql문
				String sql = "select * from member order by num";
				// 미완성 sql 문 전달하면서 PreparedStatement 객체 참조값
				pstmt = conn.prepareStatement(sql);

				// sql 문 실행
				rs = pstmt.executeQuery();
				while (rs.next()) {
					int num = rs.getInt("num");
					String name = rs.getString("name");
					String addr = rs.getString("addr");
					ta.append(Integer.toString(num) + " | " + name + " | " + addr);
					ta.append("\n");
				}

				System.out.println("출력 완료");
				JOptionPane.showMessageDialog(this, "DB view");

			} catch (Exception e1) {
				e1.printStackTrace();
			}

		});

		delete.addActionListener((e5) ->

		{

			Connection conn = null;
			String msg1 = input1.getText();

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
			// num에 msg1 입력
			int num = Integer.parseInt(msg1);

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
				System.out.println("삭제 했습니다.");
				JOptionPane.showMessageDialog(this, "DB에서 삭제 완료");

			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
	}

//	private static void oralogin() {
//
//		Connection conn = null;
//		String msg1 = input1.getText();
//		String msg2 = input2.getText();
//		String msg3 = MainClass001.input3.getText();
//
//		try {
//			// 오라클 드라이버 로딩
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			// 접속할 DB 의 정보 @아이피주소:port번호:db이름
//			String url = "jdbc:oracle:thin:@localhost:1521:xe";
//			// 계정 비밀번호를 이용해서 Connection 객체의 참조값 얻어오기
//			conn = DriverManager.getConnection(url, "scott", "tiger");
//			// 예외가 발생하지 않고 여기까지 실행순서가 내려오면 접속 성공이다.
//			System.out.println("Oracle DB 접속 성공");
//		} catch (Exception e1) {
//			e1.printStackTrace();
//		}
//
//	};

	public static void main(String[] args) {
		new MainClass001("Oracle DB 저장");
	}

}
