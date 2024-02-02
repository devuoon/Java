package TestClass;

/* 1. Getter 이용하여 초기화하기 */
class Cartwo {
	// ++++++++++++++++++++++++++++++++++++++++++ 멤버변수, 속성, 필드
	String kind = "세단";				// 공통으로 적용될 속성은 초기화를 진행한다.
	String modeName;
	String carColor;
	int carYear;
	
	// ++++++++++++++++++++++++++++++++++++++++++ 메소드(멤버함수), 기능, 행위
	public void setModelName(String m) {			// 메소드 
		this.modeName = m;
	}
	public void setcarColor(String c) {			// 메소드 
		this.carColor = c;
	}
	public void setcarYear(int y) {			// 메소드 
		this.carYear = y;
	}
}

public class CreateCarTwo {
	public static void main(String[] args) {
		Cartwo c = new Cartwo();
		Cartwo c1 = new Cartwo();
		Cartwo c2 = new Cartwo();
		
		c.setModelName("람보기니");
		c1.setcarColor("흰색");
		c2.setcarYear(2024);
		System.out.print("나의 차는 " + c.modeName + "이고 컬러는 " + c1.carColor + "이며 연식은 " + c2.carYear +"년 입니다.");
	}
}
