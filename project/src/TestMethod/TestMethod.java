package TestMethod;

public class TestMethod {
	int num;
	String name;
	
	public static void method1() {			// method1 선언, 정의 (입력x, 출력x)
		System.out.println("method1 () 실행");
	}
	
	public static void method2(int num) {
		System.out.println("나는 입력값을 하나 갖는 메소드 :  " + num);
	}
	
	public static int method3 (int num) {
		int n;					// 지역변수 n 선언
		System.out.printf("나는 입력과 출력을 가지는 메소드 :  입력 %d, 출력 %d\n", num, num);
		n = num;
		return num;		// 메소드의 출력
	}
	
	public static void main(String[] args) {
		method1();			// 메소드 호출 -> 실행
		method2(100);
		int res = method3(1);
		System.out.println("리턴 값 : " + res);
	}
}
