package test.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainClass10 {
	public static void main(String[] args) {
		Set<String> names = new HashSet<>();
		names.add("김구라");
		names.add("해골");
		names.add("원숭이");
		names.add("주뎅이");
		names.add("덩어리");

		// 반복자( Iterator) 객체 얻어내기 (저장된 item을 일렬로 세우기)
		Iterator<String> it = names.iterator();
		// hasNext는 boolean 이고 이 커서의 다음커서에 뭐가 있는지 없는지
		while (it.hasNext()) {
			// cursor 를 다음으로 이동 그걸 item에 넣기
			String item = it.next();
			System.out.println(item);
		}

		for (String string : names) {
			System.out.println(string);
		}

		// 특정 item (데이터, 참조값) 존재 여부 알아내기
		boolean isContain = names.contains("김구라");
		// 저장된 item의 갯수
		int size = names.size();
		// 특정 item 삭제
		names.remove("해골");
		// 클리어
		names.clear();

	}

}
