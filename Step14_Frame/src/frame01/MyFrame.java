package frame01;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	public MyFrame(String title) {
		super(title);
		// 창의 위치와 크기 설정
		this.setBounds(100, 100, 500, 500);
		// 이 프레임의 x 버튼을 눌렀을때 프로세스도 같이 종료되도록 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 레이아웃 매니저는 아직 사용하지 않겠다 (모든 UI를 절대좌표에 배치 하겠다)
		this.setLayout(null);

		// 버튼 하나 만들어서
		JButton btn1 = new JButton("버튼1");
		// 위치 설정
		btn1.setLocation(10, 10);
		// 크기 설정
		btn1.setSize(100, 30);
		// 프레임에 추가
		add(btn1);

		// 프레임을 화면상에 실제 보이게 하기
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// MyFrame 객체 생성
		new MyFrame("나의 프레임");
		System.out.println("main 메소드가 종료 됩니다.");
	}
}
