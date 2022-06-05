package com.question1;

public interface Y {

    void sketch();
	
	default void display() {
		System.out.println("default method executed of Y");
	}
	
	static void hey() {
		System.out.println("Hey new ststic method here of Y");
	}
}
