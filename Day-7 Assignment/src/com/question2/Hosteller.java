package com.question2;

public class Hosteller extends Student {
	
	double hostelFee;
//	Provide suitable constructors
	
	Hosteller(int studId,String studName,double examFee,double hostelFee){
		super(studId, studName, examFee);
		this.hostelFee=hostelFee;
	}
	
	public double getHostelFee() {
		return hostelFee;
	}
	
	
	 public void displayDetails3(){
		super.displayDetails();
		System.out.println("Hostel Fees:"+hostelFee);
		System.out.println();
		}
	

}
