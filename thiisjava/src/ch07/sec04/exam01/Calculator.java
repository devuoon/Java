package ch07.sec04.exam01;

public class Calculator {
	//메소드 선언
	public double areaCircle(double r) {		//다른 클래스에서 사용 가능한 매개변수를 하나가진 메소드
		System.out.println("Calculator 객체의 areacircle() 실행");
		return 3.14159 * r * r;
	}
}
