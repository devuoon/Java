package com.abst;

public class MainClass {
	public static void main(String[] args) {
		Phone p = new Galaxy();			// 인터페이스
		System.out.println(p.getNamefacture());
		System.out.println(p.getOs());
		
		p = new IPhone();
		System.out.println(p.getNamefacture());
		System.out.println(p.getOs());
		
		Phone p1 = new Phone() {

			@Override
			public String getNamefacture() {
		       		return "알뜰폰";
			}

			@Override
			public String getOs() {
				return "안드로이드";
			}
			
		};
		p = new IPhone();
		System.out.println(p.getNamefacture());
		System.out.println(p.getOs());
	}
}
