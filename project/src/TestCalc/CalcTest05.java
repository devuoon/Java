package TestCalc;

public class CalcTest05 {
	int x;
	int y;
	
	//생성자
	CalcTest05(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	int plus() {
		int result = x + y;
		return result;
	}
	
	int min() {
		int result = x - y;
		return result;
	}
	
	int mul() {
		int result = x * y;
		return result;
	}
	
	int div() {
		int result = x / y;
		return result;
	}
}
