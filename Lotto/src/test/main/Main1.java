package test.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int[] lotto = new int[6];

		System.out.print("로또를 몇개 구입하시겠어요? : ");
		int a = scan.nextInt();
//		int a = 2;

		List<int[]> lottoes = new ArrayList<>();

		for (int k = 0; k < a; k++) {

			for (int i = 0; i < 6; i++) {
				lotto[i] = ran.nextInt(1, 46);
				for (int j = 0; j < i; j++) {
					if (lotto[i] == lotto[j]) {
						i--;
					}
				}

				lottoes.add(lotto);

			}
			Arrays.sort(lotto);
			for (int i = 0; i < 6; i++) {
				System.out.print(lotto[i]);

				if (i < 5) {
					System.out.print(", ");
				}

			}
			System.out.println();

		}
	}

}
