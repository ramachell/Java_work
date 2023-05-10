package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		// 1. String type 담을수 있는 방3개짜리 빈 배열 객체를 만들어서 참조값을 지역변수 names에 담기

		String[] names = { null, null, null };
		String[] names2 = new String[3];

		// 2. 3개의 방에 순서대로 친구의 이름

		names[0] = "김1번";
		names[1] = "김2번";
		names[2] = "김3번";

		// 3. 배열에 들어있는 친구의 이름을 하나씩 콘솔에 출력
		for (int i = 0; i < names.length; i++)
			System.out.println(names[i]);

		for (String name : names) {
			System.out.println(name);
		}
	}

}
