package test.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import test.mypac.MemberDao;
import test.mypac.MemberDto;

public class TestFrame extends JFrame {

//	private JTable table;
//	private DefaultTableModel model;
	DefaultTableModel model;

	// 생성자
	public TestFrame(String title) {
		super(title);

		// 레이아웃
		setLayout(new BorderLayout());

//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		setBounds(600, 300, 700, 500);
//		setVisible(true);
		JLabel label1 = new JLabel();
		JLabel label2 = new JLabel();

		JTextField input1 = new JTextField(10);
		label1.setText("이름");

		JTextField input2 = new JTextField(10);
		label2.setText("주소");

		JButton addBtn = new JButton("추가");

		JButton deleteBtn = new JButton("삭제");

		JPanel panel = new JPanel();
		panel.add(label1);
		panel.add(input1);
		panel.add(label2);
		panel.add(input2);
		panel.add(addBtn);
		panel.add(deleteBtn);

		add(panel, BorderLayout.NORTH);

		panel.setBackground(Color.yellow);

		JTable table = new JTable();
		String[] colNames = { "번호", "이름", "주소" };

		// 테이블에 연결할 모델 객체 생성
		model = new DefaultTableModel(colNames, 0);

		// 모델을 테이블에 연결
		table.setModel(model);

		JScrollPane scr = new JScrollPane(table);

		add(scr, BorderLayout.CENTER);

		displayMember();

		addBtn.addActionListener(e -> {
			// Memberdto dto 생성하면서 인풋 읽어와서 정보담기
			MemberDto dto = new MemberDto(input1.getText(), input2.getText());
			// dto를 insert
			MemberDao.insert(dto);
			// 모델 RowCount 초기화
			displayMember();

		});

		deleteBtn.addActionListener(e -> {
			// 선택된 Row(model) 정보
			int count = table.getSelectedRow();

			if (count == -1) {
				JOptionPane.showMessageDialog(this, "선택된 row가 없습니다");
			} else {
				int sel = JOptionPane.showConfirmDialog(this, "삭제하시겠습니까?");

				if (sel == 0) {
					int num = (Integer) model.getValueAt(count, 0);
					MemberDao.delete(num);

					JOptionPane.showMessageDialog(this, "삭제 되었습니다");
					displayMember();
				}

			}

		});

		// 테이블에 출력할 sample 데이터
//		Object[] row1 = { 1, "김구라", "노량진" };
//		Object[] row2 = { 2, "해골", "행신동" };
//		Object[] row3 = { 3, "원숭이", "상도동" };
		// sample 데이터를 모델에 추가하기
//		model.addRow(row1);
//		model.addRow(row2);
//		model.addRow(row3);

//
	}

	public static void main(String[] args) {
		TestFrame f = new TestFrame("테스트");
		f.setVisible(true);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setBounds(600, 300, 700, 500);

	}

	public void displayMember() {
		model.setRowCount(0);

		List<MemberDto> list = new MemberDao().getList();
		for (int i = 0; i < list.size(); i++) {
			Object[] row = { list.get(i).getNum(), list.get(i).getName(), list.get(i).getAddr() };

			model.addRow(row);
		}
	}
}
