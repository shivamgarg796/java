package com.masai;

public class PresentationLayer {

	private ServiceLayer sl;

	public void setSl(ServiceLayer sl) {
		this.sl = sl;
	}
	
	public double sum(double a,double b) {
		 double res=sl.sum(a,b);
		 return res;
	}
	public int mul(int a,int b){
		int res=sl.multiplication(a,b);
		return res;
	}
	public float sub(float a,float b) {
		float res=sl.subtraction(a,b);
		return res;
	}
}
