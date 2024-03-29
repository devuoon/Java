package com.abst;

public class MyCar {
	//멤버변수 : 클래스 내부에 선언된 변수 , 필드, 속성
	//멤버 변수에서 초기화 하지 않고 생성자를 만들어서 초기화 시키는 것이 객체지향언어에 더 알맞음
	//생성자 : 클래스와 이름이 똑같은 메소드형태 (출력값 x)
	String company;
	String model;
	String color;
	
	// 생성자 - 객체 생성과 초기화를 담당
	// this : 멤버 자신을 가리키는 포인터
	MyCar(){		//디폴트 생성자
//		company = "삼성자동차";
//		model = "QM6";
//		color = "빨강";
		this("삼성자동차","QM6","빨강");		//자기 자신의 메서드를 실행하라 (=MyCar)
		
	}
	MyCar(String company){
		this.company = company;
	}
	MyCar(String _company, String _model, String _color){		
		this.company = _company;
		this.model = _model;
		this.color = _color;
	}
	
	//멤버함수
	void MyCarPrint() {
		System.out.printf("나의 자동차는 %s이고 %s %s 입니다. \n", company, model, color);
	}
	
	public static void main(String[] args) {
		MyCar mc1 = new MyCar();
		MyCar mc = new MyCar("현대자동차","그랜져","흰색");
		mc.MyCarPrint();
	}
}