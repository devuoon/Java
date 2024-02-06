package TestPrj;

public class Person {
	//인스턴스 필드 선언
	String name;
	String gender;
	
	// 생성자 선언 (매개변수를 두개를 사용)
	public Person(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}
	
	//메소드 정의
	void myInfo() {
		System.out.printf("나의 이름은 %s 이고 성별은 %s 입니다. \n", name, gender);
	}
	
}
