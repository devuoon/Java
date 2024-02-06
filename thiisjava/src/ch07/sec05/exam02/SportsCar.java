package ch07.sec05.exam02;

public class SportsCar extends Car{
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	//final로 선언 했기 때문에 오버라이딩을 할 수 없음
//	@Override
//	public void stop() {
//		System.out.println("스포츠카를 멈춤");
//		speed = 0;
//	}

}
