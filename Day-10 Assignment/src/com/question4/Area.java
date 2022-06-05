package com.question4;

public class Area extends Shape{

	@Override
	public int rectangleArea(int length, int breadth) {
		int area=length*breadth;
		System.out.println("Area of Rectangle :"+area);
		return area;
	}

	@Override
	public int squareArea(int side) {
		int area=side*side;
		System.out.println("Area of square :"+area);
		return area;
	}

	@Override
	public int circleArea(int radius) {
		int area=(22/7)*radius*radius;
		System.out.println("Area of Circle :"+area);
		return area;
	}
	
	
}
