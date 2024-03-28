package com.tcp.test01;

class Animal{
	int num = 10;
	String name;			// 멤버변수
	Animal() {
		System.out.println("Animal 생성자");
	}
	void setName(String name) {						// 멤버함수
		this.name = name;
	}
}
class Dog extends Animal{		// Animal 클래스 상속받는 Dog 클래스
	int num = 20;
	Dog() {
		System.out.println("Dog 생성자");
	}
	void sleep() {
		System.out.println(this.name + "자는중 Zzz..");
	}
}

class HouseDog extends Dog {
	int num = 30;
	HouseDog(String name) { // 매개변수명을 string에서 name으로 변경
        this.setName(name); // 매개변수로 전달된 값을 setName() 메서드를 통해 name 멤버 변수에 설정
        System.out.println("HouseDog 생성자 ");
    }
	@Override
	void sleep() {			// 재정의(오버라이딩)
		System.out.println(this.name + "자는중 Zzz..");
	}
	void sleep(int h) {	// 다중정의(오버로딩)
		System.out.println(this.name + "흐아암");
	}
	void numPrint(int num) {
	    System.out.printf("Anum%d Dnum%d Hnum%d\n", ((Animal)this).num, ((Dog)this).num, this.num);
	}
}

public class lnheSample {
	public static void main(String[] args) {
		//Dog dog = new Dog();		// Dog 객체 생성
		//dog.setName("멍멍이");
		//System.out.println(dog.name);
		//dog.sleep();
		HouseDog houseDog = new HouseDog("바둑이");
		houseDog.setName("만두");
//		houseDog.sleep();
//		houseDog.sleep(1);
		System.out.println(houseDog.name);
		houseDog.numPrint(0);
	}
}
