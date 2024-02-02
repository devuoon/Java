package TestClass;

/* 2. 생성자를 이용한 초기화 */
class CarThree{
	String kind = "세단";				// 공통으로 적용될 속성은 초기화를 진행한다.
	String modelName;
	String carColor;
	int carYear;
	
	CarThree() {							// 생성자(디폴트 생성자 : 입력이 없는 생성자)
		System.out.printf("나는 디폴트 생성자입니다.");
	}
	
	CarThree(String modelName, String carColor, int carYear) {			// 생성자 (입력이 있는 생성자)
		this.modelName = modelName;
		this.carColor = carColor;
		this.carYear = carYear;
		System.out.println("나는 매개변수 세개를 갖는 생성자입니다.");
	}

}

public class CreateCarThree {
	public static void main(String[] args) {
		// CarThree c = new CarThree();			// 자동으로 디폴트 생성자가 호출된다.
		CarThree c1 = new CarThree("마티즈", "검정", 2023);
		System.out.printf("나의 차 종류는 %s %s이고 색깔은 %s이고 연식은 %d 입니다." , c1.kind,c1.modelName, c1.carColor, c1.carYear);
	}
}
