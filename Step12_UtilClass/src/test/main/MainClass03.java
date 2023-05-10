package test.main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MainClass03 {
	public static void main(String[] args) {
		List<String> greets = new ArrayList<>();
		greets.add("hello");
		greets.add("hi");
		greets.add("good night");

		Consumer<String> con = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println("오 : " + t);
			}
		};

		greets.forEach(con);

		greets.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println("오2 : " + t);
			}
		});

		greets.forEach((t) -> {
			System.out.println("오3 : " + t);
		});

	}
}
