package test.main;

import java.io.File;
import java.io.IOException;

public class MainClass05 {
	public static void main(String[] args) {

		/*
		 * 현재 존재하거나 존재하지않거나 하는 파일이나 폴더 제어할수 있는 File 객체 생성
		 * 참조값을 지역변수 f 에 담기
		 */
		File f = new File("C:/Acorn202304/myFolder/memo.txt");

		// 실제 memo.txt 파일이 존재하지 않으면 파일 만들고
		// 존재하면 memo.txt 파일을 삭제하도록 프로그래밍 해보세요

		if (!f.exists()) {
			try {
				f.createNewFile();
				System.out.println("memo.txt 파일을 만들었습니다.");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			f.delete();
			System.out.println("memo.txt 파일을 삭제했습니다.");
		}
	}

}
