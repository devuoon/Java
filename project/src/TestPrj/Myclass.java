package TestPrj;

public class Myclass {

	public static void main(String[] args) {
		// 생성자 오버로딩
		int a = 10;
		int b = 20;
		double x = 1.2;
		double y = 2.4;
		 
		plus(a, b);
		plus(x, y);
		plus(a);
	}
	
	public static void plus(int a, int b) {
		int res = a + b;
		System.out.printf("res: %d\n", res);
	}
	public static void plus(int a) {
		int res = a;
		System.out.printf("res: %d\n", res);
	}
	public static void plus(double x, double y) {
		double res = x + y;
		System.out.printf("res: %f\n", res);
	}

}
