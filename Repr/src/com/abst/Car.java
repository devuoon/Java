package com.abst;

public abstract class Car {
	public abstract void drive();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void stopCar() {
		System.out.println("시동을 끕니다.");
	}
}
