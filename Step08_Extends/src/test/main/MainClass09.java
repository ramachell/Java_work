package test.main;

import test.util.MyUtil;

public class MainClass09 {
	public static void main(String[] args) {
		// MyUtil만 임포트했지만
		// MyUtil은 BaseUtil을 상속하므로 BaseUtil 메소드도 다 사용가능

		MyUtil.send();
		MyUtil.clear();
		MyUtil.light();

	}

}
