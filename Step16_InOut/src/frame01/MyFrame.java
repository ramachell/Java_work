package frame01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame extends JFrame {

	public MyFrame(String title) {
		super(title);

		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// BorderLayout 으로 설정
		setLayout(new BorderLayout());

		// UI 를 감쌀 페널
		JPanel p1 = new JPanel();

		JTextField inputText = new JTextField(20);
		JButton saveBtn = new JButton("저장");
		saveBtn.setActionCommand("save");

		// 페널에 UI 를 추가
		p1.add(inputText);
		p1.add(saveBtn);
		// 페널을 프레임의 북쪽에 배치
		add(p1, BorderLayout.NORTH);
		// 페널의 배경색
		p1.setBackground(Color.YELLOW);
		/*
		 *  읽어오기 버튼을 누르면 diary.txt 에 있는 모든 문자열을 읽어와서 
		 *  JTextArea 에 출력해 보세요.
		 *  
		 *  - hint 
		 *  FileReader 객체를 활용하면 파일에서 문자열을 읽어 낼수 있습니다.
		 */

		JTextArea ta = new JTextArea();

		add(ta, BorderLayout.CENTER);

		JButton readBtn = new JButton("읽어오기");
		saveBtn.setActionCommand("read");
		p1.add(readBtn);

		setVisible(true);

		// 버튼에 리스너 등록
		saveBtn.addActionListener((e2) -> {
			// 입력한 문자열 읽어오기
			String msg = inputText.getText(); // 바깥 영역에 정의된 지역변수 참조 가능!
			// File 객체
			File f = new File("C:\\acorn202304\\myFolder\\diary.txt");

			try {
				if (!f.exists()) {
					f.createNewFile();
				}
				// 파일에 문자열을 출력할 객체
				FileWriter fw = new FileWriter(f, true);
				fw.write(msg);
				fw.write("\r\n"); // 개행기호
				fw.flush();
				fw.close();
				JOptionPane.showMessageDialog(this, "저장 했습니다");

			} catch (Exception e) {
				e.printStackTrace();
			}

		});
		readBtn.addActionListener(e3 -> {

			try {
				FileReader reader = new FileReader("C:\\acorn202304\\myFolder\\diary.txt");
				int cha = reader.read();
				while (cha != -1) {
					String msg2 = String.valueOf((char) cha);
					ta.append(msg2);
				}
				ta.append("\n ------------\n");
				JOptionPane.showMessageDialog(this, "read 했습니다");
				reader.close();

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		});
	}

	public static void main(String[] args) {
		new MyFrame("나의 프레임");
	}
}
