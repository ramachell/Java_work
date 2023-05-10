package test.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class QuizMain3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("로또를 몇개 구입하기겠어요? : ");
		int count = scan.nextInt();
		for (int i = 0; i < count; i++) {
			printLotto();
		}
		;

	}

	private static void printLotto() {
		// 로또 6개를 출력하는 프로그램
		// random
		Random ran = new Random();

		// 로또 번호 저장할 HashSet 객체 생성해서 참조값을 Set인터페이스 type 변수에 담기
		Set<Integer> lottoSet = new HashSet<>();

		// lottoSet 에 1~45 숫자 6개 넣기 (중복뜨면 한번 더 시행)
		while (true) {
			lottoSet.add(ran.nextInt(1, 46));
			if (lottoSet.size() > 5)
				break;
		}
		System.out.println(lottoSet);

		// lottoSet 담을 List
		List<Integer> lottoNums = new ArrayList<>(lottoSet);

		// lottoNums 오름차순 정렬
		Collections.sort(lottoNums);
		System.out.println(lottoNums);

		// 순서 반대로 Collections.reverse(lottoNums);
		// 내림차순 Collections.sort(lottoNums, Collections.reverseOrder());

		// 출력하기
		for (int i = 0; i < lottoNums.size(); i++) {
			System.out.print(lottoNums.get(i));
			// 숫자 사이에만 , 넣기
			if (i < lottoNums.size() - 1)
				System.out.print(", ");
		}
		System.out.println();

	}
}
