package frame03;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	public MyFrame(String title) {
		super(title);
		// 창의 위치와 크기 설정
		this.setBounds(100, 100, 500, 500);
		// 이 프레임의 x 버튼을 눌렀을때 프로세스도 같이 종료되도록 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// GridLayout 매니저 사용해보기
		this.setLayout(new GridLayout(2, 2));

		JButton btn1 = new JButton("버튼1");
		add(btn1);
		JButton btn2 = new JButton("버튼2");
		add(btn2);
		JButton btn3 = new JButton("버튼3");
		add(btn3);
		JButton btn4 = new JButton("버튼4");
		add(btn4);

		// 프레임을 화면상에 실제 보이게 하기
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// MyFrame 객체 생성
		new MyFrame("나의 프레임2");
		System.out.println("main 메소드가 종료 됩니다.");
	}
}
