package TestClass;


class Car {
	String modeName;			// 멤버 변수 == 필드 == 속성
	String carColor;
	int carYear;
}

public class CreateCar {
	public static void main(String[] args) {
		/* 	car 타입의 변수 c에 car 클래스의 객체를 집어넣어라. 	*/
		Car c1 = new Car();			// 객체생성	( default 생성자 호출)
		// int i = 100;
		Car c2 = new Car();
		Car c3 = new Car();
		
		c1.modeName = "테슬라";
		c2.modeName = "벤츠";
		c3.modeName = "지프";
		
		System.out.println(c1.modeName);
		System.out.println(c1.carColor);
		System.out.println(c1.carYear);
	}	
}
