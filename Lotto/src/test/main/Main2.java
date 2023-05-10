package test.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

//
// 1. java  콘솔창 실행 결과 
//
// 로또를 몇개 구입하시겠어요 :  2  
// 1, 4, 5, 6, 40, 45
// 3, 4, 10, 15, 16, 20
//
//
// 단) 번호는 오름차순 정렬되어있어야 한다. 
//    중복된 번호가 나오면 안된다. 

public class Main2 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		List<Integer> lotto = new ArrayList<>();

		System.out.print("로또를 몇개 구입하시겠어요 : ");
		int count = scan.nextInt();
		// 구매횟수 : count
		for (int i = 0; i < count; i++) {
			// 1~45까지의 숫자를 받아와서 lotto에 add
			for (int j = 0; j < 6; j++) {
				lotto.add(ran.nextInt(1, 46));

				// 중복 숫자 제거
				for (int k = 0; k < j; k++) {
					if (lotto.get(j) == lotto.get(k)) {
						lotto.remove(j);
						j--;
					}
				}
			}
			// 숫자 정렬
			Collections.sort(lotto);
			// 숫자 출력
			for (int j = 0; j < 6; j++) {
				System.out.print(lotto.get(j));
				// 숫자 사이에만 , 넣기
				if (j < 5) {
					System.out.print(", ");
				}

			}

			// 줄바꿈하고 다시 사용하기위해 lotto 초기화
			System.out.println();
			lotto.clear();

		}

	}
}