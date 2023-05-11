package test.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass03 {

	public static void main(String[] args) {
		/*
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		// 문자열을 아예 1줄씩 입력받을수 있는 객체
		BufferedReader br = new BufferedReader(isr);
		*/

		// 위 1줄로 요약
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("문자열 한줄 입력");
		try {
			// BufferedReader 객체의 readLine() 메소드를 이용해서 문자열 한줄을 읽어들이기
			String line = br.readLine();
			System.out.println("line : " + line);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

	}
}
