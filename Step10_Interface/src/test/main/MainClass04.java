package test.main;

import test.mypac.Drill;

public class MainClass04 {
	public static void main(String[] args) {
		useDrill(new Drill() {

			@Override
			public void hole() {
				System.out.println("hole()");
			}
		});

		useDrill(() -> {
			System.out.println("useDrill");

		});

	}

	public static void useDrill(Drill d) {
		d.hole();
		d.hole();
	}
}
