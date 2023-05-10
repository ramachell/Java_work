package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		// 0으로 초기화된 방 3개짜리 int[] 객체 만들어서 참조값을 지역변수 nums에 담기
		int[] nums = { 0, 0, 0 };
		// 0번방에 10, 1번방에 20, 2번방에 30을 저장해보세요.
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;

		// 500개인 방 만들어서 nums2에 담기
		int[] nums2 = new int[500];
		int nums3[] = new int[500];
//
//		for (int i = 0; i < nums2.length; i++) {
//			// nums2[i] = 10 * (i + 1);
//			nums2[i] = 0;
//			}
		for (int i = 0; i < 500; i++) {
			nums3[i] = 10 * i;
		}
//
//		for (int i : nums3) {
//			nums3;
//		}

	}

}
