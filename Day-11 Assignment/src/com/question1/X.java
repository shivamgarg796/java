package com.question1;

public interface X {
	
	void draw();
	
	default void show() {
		System.out.println("default method executed Of X");
	}
	
	static void hello() {
		System.out.println("Hello new static method here of X");
	}
}
