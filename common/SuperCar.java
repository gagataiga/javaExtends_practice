package javaExtendproject.common;


public class SuperCar extends Car{
	
	
	
	
	public void stop(){
		    System.out.println("car stop");
			System.out.println(super.getName());
			System.out.println("");
			System.out.println(this.getName());
	}
	public void crash() {
		System.out.println("car is crashed");
		System.out.println(this.getName());
		}
}
