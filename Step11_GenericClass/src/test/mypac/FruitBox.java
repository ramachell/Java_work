package test.mypac;

public class FruitBox<T> {

	/*
	 *  클래스 안에서 사용하는 특정 type를 고정하지 않고
	 *  클래스를 사용하는 시점에 type 정함
	 *  
	 *  아래 선언한 T는 맘대로 스펠링이나 단어를 정할수 있다
	 *  <aaddaadd> 도 가능은 하다는말
	 *  보통 type 라는 의미에서 T를 쓴다 
	 *  T를 포괄클래스 라고 한다 Generic Class
	 */

	private T item;

	public void pack(T item) {
		System.out.println("pack()");
		this.item = item;
	};

	public T unPack() {
		System.out.println("unPack()");
		return item;
	}

}
