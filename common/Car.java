package javaExtendproject.common;

public class Car {
	private String name;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void go() {
		System.out.println(this.name + " goes");
	}
	
	public void stop() {
		System.out.println(this.name + " stop");
	}

}
