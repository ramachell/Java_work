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

import test.mypac.AccDao;
import test.mypac.AccDto;

public class TestFrame2 extends JFrame {

//	private JTable table;
//	private DefaultTableModel model;
	DefaultTableModel model;

	// 생성자
	public TestFrame2(String title) {
		super(title);

		// 레이아웃
		setLayout(new BorderLayout());

//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		setBounds(600, 300, 700, 500);
//		setVisible(true);
		JLabel label1 = new JLabel();
		JLabel label2 = new JLabel();
		JLabel label3 = new JLabel();
		JLabel label4 = new JLabel();
		JLabel label5 = new JLabel();

		JTextField input1 = new JTextField(5);
		label1.setText("날짜");

		JTextField input2 = new JTextField(5);
		label2.setText("수입");

		JTextField input3 = new JTextField(5);
		label3.setText("지출");

		JTextField input4 = new JTextField(15);
		label4.setText("사유");

		JButton addBtn = new JButton("추가");

		JButton deleteBtn = new JButton("삭제");

		JPanel panel = new JPanel();
		panel.add(label1);
		panel.add(input1);
		panel.add(label2);
		panel.add(input2);
		panel.add(label3);
		panel.add(input3);
		panel.add(label4);
		panel.add(input4);

		panel.add(addBtn);
		panel.add(deleteBtn);

		add(panel, BorderLayout.NORTH);

		panel.setBackground(Color.yellow);

		JTable table = new JTable();
		String[] colNames = { "번호", "날짜", "수입", "지출", "사유", "잔액" };

		// 테이블에 연결할 모델 객체 생성
		model = new DefaultTableModel(colNames, 0);

		// 모델을 테이블에 연결
		table.setModel(model);
		table.getColumn("번호").setWidth(0);
		table.getColumn("번호").setMinWidth(0);
		table.getColumn("번호").setMaxWidth(0);

		JScrollPane scr = new JScrollPane(table);

		add(scr, BorderLayout.CENTER);

		displayMember();

		addBtn.addActionListener(e -> {
			// Memberdto dto 생성하면서 인풋 읽어와서 정보담기
			String da = input1.getText();

			int inc;
			try {
				inc = Integer.parseInt(input2.getText());

			} catch (Exception e2) {
				inc = 0;
			}
			int outc;
			try {
				outc = Integer.parseInt(input3.getText());
			} catch (Exception e2) {
				outc = 0;
			}

			String con = input4.getText();

			AccDto dto = new AccDto(da, inc, outc, con);
			// dto를 insert
			new AccDao().insert(dto);

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

				if (sel == JOptionPane.YES_OPTION) {

					int num = (Integer) model.getValueAt(count, 0);
					AccDao.delete(num);

					JOptionPane.showMessageDialog(this, "삭제 되었습니다");
					displayMember();
				}

			}

		});

	}

	public static void main(String[] args) {
		TestFrame2 f = new TestFrame2("테스트");
		f.setVisible(true);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setBounds(600, 300, 900, 500);

	}

	public void displayMember() {
		model.setRowCount(0);

		List<AccDto> list = new AccDao().getList();
		int money = 0;
		for (int i = 0; i < list.size(); i++) {
			AccDto tmp = list.get(i);

			money += tmp.getInc() - tmp.getOutc();
			Object[] row = { tmp.getAccno(), tmp.getDa(), tmp.getInc(), tmp.getOutc(), tmp.getCon(), money };
			model.addRow(row);
		}
	}
}
