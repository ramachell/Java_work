package test.mypac;

public class MacBook {
	// private로 필드 3개 선언
	private Cpu cpu;
	private Memory memory;
	private HardDisk hardDisk;

	// 생성자
	public MacBook() {
	}

	public MacBook(Cpu cpu, Memory memory, HardDisk hardDisk) {
		// 생성자의 매개변수에 전달된값을 필드에 저장
		this.cpu = cpu;
		this.memory = memory;
		this.hardDisk = hardDisk;
	}

	public void doGame() {
		if (this.cpu == null || memory == null || hardDisk == null) {
			System.out.println("부품이 부족해서 게임을 할수가 없어요!");
			return; // 메소드 종료
		}
		System.out.println("신나게 겜해!!!!!");
	}

	public Cpu getcpu() {
		return cpu;
	};

}
