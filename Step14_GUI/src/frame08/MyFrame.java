package frame08;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {
	JTextField input;
	JLabel label;

	// 생성자
	public MyFrame(String title) {
		super(title);
		// 초기 위치 크기 설정
		setBounds(600, 300, 700, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		// 문자열 입력 되는 JTextField
		input = new JTextField(20);

		JButton send = new JButton("전송");
		send.setActionCommand("send");
		send.addActionListener(this);

		JButton send2 = new JButton("전송2");
		send2.addActionListener(e -> {
			String msg = input.getText();
			JOptionPane.showMessageDialog(this, msg);
		});
		label = new JLabel("..");

		add(input);
		add(send);
		add(send2);
		add(label);

		setVisible(true);
	}

	public static void main(String[] args) {
		new MyFrame("제목");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if (cmd.equals("send")) {
			// input 에 입력한 내용 msg 에 저장
			String msg = input.getText();
			// 그 msg 를 알림창에 출력
			JOptionPane.showMessageDialog(this, msg);
			// setText()로 msg 를 JLabel 에 출력
			label.setText(msg);

		}
	}

}
