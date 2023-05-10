package frameTest;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {

	/* 
	 * TODO
	 * 
	 * JFrame 만들기
	 * 
	 * 라벨 만들기 (추가할 내용 입력)
	 * 
	 * 인풋박스 그리고 추가버튼과 삭제버튼
	 * 
	 * 그리고 그 추가된게 들어갈 JList
	 * 
	 */

	// 먼저 필요한 필드 만들기
	private JTextField input;
	private DefaultListModel<String> model;
	private JList list;

	public MyFrame() {
		// 프레임 만들기
		setSize(800, 500);
		setLocation(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// BorderLayout 사용
		setLayout(new BorderLayout());

		// UI 만들기
		JLabel label = new JLabel("추가할 내용 입력");
		// 입력할곳
		input = new JTextField(10);
		// 버튼
		JButton addBtn = new JButton("추가");
		addBtn.setActionCommand("add");
		addBtn.addActionListener(this);

		JButton deleteBtn = new JButton("삭제");
		deleteBtn.setActionCommand("delete");
		deleteBtn.addActionListener(this);

		// UI 넣을 페널 만들기
		JPanel topPanel = new JPanel();
		topPanel.add(label);
		topPanel.add(input);
		topPanel.add(addBtn);
		topPanel.add(deleteBtn);

		// 이 페널 프레임 위쪽에 추가
		add(topPanel, BorderLayout.NORTH);

		// 이제 그 아래 JList 넣기
		list = new JList<>();

		// JList에 들어갈 model 객체
		model = new DefaultListModel<>();
		list.setModel(model);
		add(list);

		setVisible(true);
	}

	public static void main(String[] args) {
		new MyFrame();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// getActionCommand 받아오기
		String cmd = e.getActionCommand();
		// ActionCommand 의 내용에 따라 다른 동작 수행 (버튼 구분)
		if (cmd.equals("add")) {
			// input 내용 list에 추가
			String name = input.getText();
			model.addElement(name);
			input.setText("");
		} else if (cmd.equals("delete")) {
			// 선택된 객체 index 받기 , index가 0이 아니라면 그거 삭제
			int index = list.getSelectedIndex();
			if (index >= 0) {
				model.remove(index);
			}
		}
	}

}
