package frame05;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame implements ActionListener {
	public MyFrame(String title) {
		super(title);
		// 창의 위치와 크기 설정
		this.setBounds(100, 100, 500, 500);
		// 이 프레임의 x 버튼을 눌렀을때 프로세스도 같이 종료되도록 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// BorderLayout 매니저 사용해보기
		this.setLayout(new FlowLayout());

		JButton sendBtn = new JButton("전송");
		add(sendBtn);

		// 여기서의 this는 JFrame 근데 JFrame은 쭉 올라가다보면 Component를 상속받으니 가능
		// java.lang.Object
		// -java.awt.Component
		// --java.awt.Container
		// ---java.awt.Window
		// ----java.awt.Frame
		// -----javax.swing.JFrame
		// Component a = this;

		// ActionListener 인터페이스 type 참조값 listener1 에 담기
		ActionListener listener1 = new ActionListener() {
			// 이 리스너를 등록한 UI에 어떤 액션이 발생하면 호출되는 메소드임
			@Override
			public void actionPerformed(ActionEvent e) {

				System.out.println("전송");
				// JOptionPane.showMessage(프레임의 참조값, 띄울 메시지)
				// 여기서의 this 는 ActionListener 클래스 내부기때문에 ActionListener
				// 하지만 MyFrame.this 를 사용하면 this를 쓸수있다
				JOptionPane.showMessageDialog(MyFrame.this, "전송합니다");

			}
		};
		// 전송 버튼에 listener1 등록
		sendBtn.addActionListener(listener1);

		JButton deleteBtn = new JButton("삭제");
		add(deleteBtn);

//		deleteBtn.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("삭제버튼");
//			}
//		});

		deleteBtn.addActionListener(e -> {
			System.out.println("삭제");
			System.out.println(e);
			System.out.println(e.getID());
			// 하지만 이런 함수형태의 메소드는 this가 바깥 클래스로 생성한 객체의 참조값을 가리킴
			JOptionPane.showMessageDialog(this, "삭제합니다.");
		});

		JButton updateBtn = new JButton("수정");
		add(updateBtn);
		updateBtn.addActionListener(this);

//		 이건 한번만 쓸수있음
		JButton update2Btn = new JButton("수정2");
		add(update2Btn);
		update2Btn.addActionListener(this);

		// 프레임을 화면상에 실제 보이게 하기
		this.setVisible(true);

	}

	public static void main(String[] args) {
		// MyFrame 객체 생성
		new MyFrame("나의 프레임");
		System.out.println("main 메소드가 종료 됩니다.");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 이기능은 한번만 되지만 getActionCommand() 비교해서
		// 버튼별로 동작 나눠서 버튼 여러개 기능 입력가능
		String com = e.getActionCommand();

		if (com == "수정") {
			System.out.println("수정1번");
			JOptionPane.showMessageDialog(this, "수정합니다1");
		} else if (com == "수정2") {
			System.out.println("수정2번");
			JOptionPane.showMessageDialog(this, "수정합니다2");
		}

	}
}
