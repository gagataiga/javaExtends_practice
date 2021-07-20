package javaExtendproject.common;

public class Car {
	String name;
	
	public Car() {
		this.name = "normalCar";
	}
	
	public Car(String carName) {
		this.name = carName;
	}
	
	public void go() {
		System.out.println(this.name + "goes");
	}
	
	public void stop() {
		System.out.println(this.name + "stop");
	}

}
