package frame09;

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
	JTextField input2;
	JLabel label;

	// 생성자
	public MyFrame(String title) {
		super(title);
		// 초기 위치 크기 설정
		setBounds(600, 300, 700, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		// 문자열 입력 되는 JTextField
		input = new JTextField(10);
		input2 = new JTextField(10);

		JButton plus = new JButton("+");
		plus.setActionCommand("plus");
		plus.addActionListener(this);

		JButton minus = new JButton("-");
		minus.setActionCommand("minus");
		minus.addActionListener(this);

		JButton multi = new JButton("*");
		multi.setActionCommand("multi");
		multi.addActionListener(this);

		JButton divide = new JButton("/");
		divide.setActionCommand("divide");
		divide.addActionListener(this);
		JLabel label0 = new JLabel(" = ");
		label = new JLabel();

		add(input);
		add(plus);
		add(minus);
		add(multi);
		add(divide);
		add(input2);
		add(label0);
		add(label);

		setVisible(true);
	}

	public static void main(String[] args) {
		new MyFrame("제목");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		// input 에 입력한 내용 msg 에 저장
		try {
			double result1 = 0;
			String result2;

			double msg = Double.parseDouble(input.getText());
			double msg2 = Double.parseDouble(input2.getText());

			if (cmd.equals("plus")) {
				// msg msg2 연산하기
				result1 = msg + msg2;
			} else if (cmd.equals("minus")) {
				result1 = msg - msg2;
			} else if (cmd.equals("multi")) {
				result1 = msg * msg2;
			} else if (cmd.equals("divide")) {
				// try {

				if (Double.isInfinite(msg / msg2)) {
					JOptionPane.showMessageDialog(this, "0으로 나눌 수 없습니다.");
					return;
				} else {
					result1 = msg / msg2;
				}

//				System.out.println(msg + " " + msg2);

				// } catch (ArithmeticException e2) {
				// e2.printStackTrace();
				// JOptionPane.showMessageDialog(this, "0으로 나눌 수 없습니다.");
				// }

				// double 은 소수를 정확히 표현하기 불가능해서 0으로 나눠도 infinity 가 나오지 에러가 안난다
				// 이걸 처리하기위해 그냥... isInfinity() 쓰자... 아니면 BigDecimal Class 쓰자...
				// double a = (int) 5.5 / (int) (0.0);
				// System.out.println(a);
				// int b = 5 / 0;
				// System.out.println(b);
			}

			// result1을 텍스트로 바꾸기
			result2 = Double.toString(result1);
			// setText()로 msg 를 JLabel 에 출력
			label.setText(result2);

		}

		catch (NumberFormatException e3) {
			JOptionPane.showMessageDialog(this, "숫자를 입력해주세요");
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
		}
	}
}