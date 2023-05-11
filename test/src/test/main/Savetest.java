package test.main;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Savetest extends JFrame implements ActionListener {
	// 필드
	JTextField tf;

	// 생성자
	public Savetest(String title) {
		super(title);
		// 프레임의 초기 설정 작업하기
		setBounds(100, 100, 500, 500);
		// 이프레임(MyFrame)의 x 버튼 (close 버튼) 을 눌렀을때 프로세스도 같이 종료 되도록 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 레이아웃 설정
		setLayout(new FlowLayout());

		JButton startBtn = new JButton("저장");
		startBtn.addActionListener(this);
		startBtn.setActionCommand("save");
		// 프레임에 버튼 추가
		add(startBtn);

		JButton startBtn2 = new JButton("로드");
		startBtn2.addActionListener(this);
		startBtn2.setActionCommand("load");
		// 프레임에 버튼 추가
		add(startBtn2);

		tf = new JTextField(10);
		// 프레임에 JTextField 추가
		add(tf);

		// 프레임을 화면상에 실제 보이게 하기( false 하면 화면에 보이지 않는다 )
		setVisible(true);
	}

	// 저장 버튼 누르면 텍스트필드에 입력된 문자열을 diary.txt 파일에 입력(덮어쓰기)
	// 로드 버튼 누르면 diary.txt 파일 첫줄 읽어와서 텍스트필드에 출력!
	@Override
	public void actionPerformed(ActionEvent e) {

		File f = new File("C://Acorn202304/MyFolder/diary.txt");
		if (e.getActionCommand() == "save") {
			String msg = tf.getText() + "\n";

			// 만일 파일이 존재하지 않는다면
			try {
				if (!f.exists()) {
					// 파일 만든다
					f.createNewFile();
					System.out.println("diary.txt 파일 만들었습니다");
				}
				// 파일에 문자열을 출력할수 있는 객체의 참조값 얻어내기
				// new FileWriter (File 객체 , append 모드 여부)
				FileWriter fw = new FileWriter(f, false);
				fw.write(msg); // 출력할준비
				fw.flush(); // 출력
				fw.close(); // 마무리
				System.out.println("diary.txt 파일에 문자열을 입력했습니다. : " + msg);

			} catch (IOException e1) {
				e1.printStackTrace();
			}
		} else if (e.getActionCommand() == "load") {

			try {
				if (!f.exists()) {
					// 파일 만든다
					f.createNewFile();
					System.out.println("diary.txt 파일 만들었습니다");
				}

				// FileReader
				FileReader fr = new FileReader(f);
				// 한줄씩 읽어오는 BufferedReader
				BufferedReader br = new BufferedReader(fr);
				// 첫줄 읽어와서 msg2에 입력
				String msg2 = br.readLine();
				// 읽어온 한줄 JTextField에 출력!
				tf.setText(msg2);
				br.close();
				System.out.println("diary.txt 파일의 첫번째 줄을 불러왔습니다. : " + msg2);

			} catch (IOException e1) {
				e1.printStackTrace();
			}

		}

	}

	public static void main(String[] args) {
		new Savetest("저장테스트");
	}
}