package test.main;

public class MainClass01 {
	public static void main(String[] args) {
		// int type 5개를 저장하고 있는 배열 객체 생성해서 참조값을 nums 라는 지역 변수에 담기
		int[] nums = { 10, 20, 30, 40, 50 };
		// double 5개
		double[] nums2 = { 10.1, 10.2, 10.3, 10.4, 10.5 };
		// boolean 5개
		boolean[] truth = { true, false, false, true, true };
		// String (참조 data type) 5개
		String[] names = { "김구라", "해골", "원숭이", "주뎅이", "덩어리" };

		// 배열 객체는 clone() 메소드, length 라는 필드가 있다

		// 복제본 얻어내기
		int[] result = nums.clone();
		int[] result2 = nums;
		// 배열의 크기 얻기
		int size = nums.length;
		// 배열은 순서가 있는 데이터다
		int first = nums[0];
		int second = nums[1];
		int third = nums[2];

	}
}
