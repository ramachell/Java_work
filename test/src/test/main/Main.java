package test.main;

import test.pac.Student;

public class Main {
	public static void main(String[] args) {

		Student s1 = new Student();

//		s1.stuNum = 1;

//		s1.setStuNum(6);

		System.out.println(s1.getStuNum());

		int[] its = { 3, 8, 6 };
		for (int i = 0; i < 5; i++) {
			System.out.println(its[i]);
		}

	}

}
