package test.main;

import test.mypac.MyUtil;

public class MainClass07 {
	public static void main(String[] args) {

		MyUtil.draw();
		try {
			MyUtil.send();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main 메소드 종료");
	}

}
