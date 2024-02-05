package TestClass;

public class MyClass {
	/* 클래스 구성 멤버: 멤버변수 + 멤버함수 + 생성자 */
	// ============= 멤버변수
	String name;
	int age;
				
	// ============= 생성자
	MyClass(String name, int age) {
		this.name = name;				
		this.age = age;
	}
	// ============= 멤버함수
	void printMyClass() {	
		System.out.printf("나의 이름 : %s, 나의 나이: %d", name, age);
	}
}
