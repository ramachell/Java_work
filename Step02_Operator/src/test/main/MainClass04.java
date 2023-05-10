package test.main;

// 4. 논리연산자 테스트 
// && || 
public class MainClass04 {
	public static void main(String[] args) {
		boolean result1 = false || true; // f or t = t
		boolean result2 = false || false; // f or f = f
		boolean result3 = true && false; // t and f = f
		boolean result4 = true && true; // t and t = t

		boolean result5 = true != true; // false
		boolean result6 = false != true; // true
	}

}
