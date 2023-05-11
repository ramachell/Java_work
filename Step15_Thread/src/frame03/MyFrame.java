package frame03;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {
	// 생성자
	public MyFrame(String title) {
		super(title);
		// 프레임의 초기 설정 작업하기
		setBounds(100, 100, 500, 500);
		// 이프레임(MyFrame)의 x 버튼 (close 버튼) 을 눌렀을때 프로세스도 같이 종료 되도록 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 레이아웃 설정
		setLayout(new FlowLayout());

		JButton startBtn = new JButton("작업 시작");
		startBtn.addActionListener(this);
		// 프레임에 버튼 추가
		add(startBtn);

		JTextField tf = new JTextField(10);
		// 프레임에 JTextField 추가
		add(tf);

		// 프레임을 화면상에 실제 보이게 하기( false 하면 화면에 보이지 않는다 )
		setVisible(true);
	}

	// AnotherThread aa = new AnotherThread ();
	// aa.start() 는 불가능
	// 필드에 담아놓고 쓰는거 불가능

	@Override
	public void actionPerformed(ActionEvent e) {
		new CountThread().start();
	}

	class CountThread extends Thread {
		public void run() {
			// 카운트 저장할 지역변수만들고 초기값
			int count = 10;
			while (true) {
				if (count == 0) {
					break;
				}
				// 1초마다
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				count--;
				System.out.println(count);
			}

		}
	}

	// run 했을때 app이 시작되는 메소드
	public static void main(String[] args) {
		new MyFrame("프레임");

	}
}
