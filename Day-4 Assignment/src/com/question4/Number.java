package com.question4;

public class Number {

	public void whole(int a) {
		if(a%2==1)
		System.out.println(a+" "+a);
		
		else if(a%2==0) {
			int b;
			b=a/10;
			b++;
			b=b*10;
			System.out.println(a+" "+b);
		}
		else if(a<0) {
			System.out.println(a+" "+"Error");
		}
	}

	
	public static void main(String []args) {
		Number n=new Number();
		n.whole(44);
		n.whole(45);
		n.whole(-5);
	}
}