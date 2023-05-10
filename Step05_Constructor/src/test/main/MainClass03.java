package test.main;

import test.mypac.Cpu;
import test.mypac.HardDisk;
import test.mypac.MacBook;
import test.mypac.Memory;

public class MainClass03 {
	public static void main(String[] args) {
		/*
		 *  MacBook 객체 생성해서 참조값을 mac1 이란 지역변수에 담기
		 *  
		 *  주의
		 *  MacBook 클래스 수정 x
		 *  MainClass03은 test.main에 있고
		 *  나머지 MacBook Cpu Memory HardDisk는 test.mypac에 있기때문에
		 *  4개 클래스 다 import 되야함
		 */

		MacBook mac1 = new MacBook(new Cpu(), new Memory(), new HardDisk());
		MacBook mac2 = new MacBook(null, null, null);

		mac1.doGame();
		mac2.doGame();
		Cpu c = new Cpu();
		Memory m = new Memory();
		HardDisk h = new HardDisk();
		MacBook mac3 = new MacBook(c, m, h);
		mac3.doGame();

		System.out.println(mac1.getcpu());
	}
}
