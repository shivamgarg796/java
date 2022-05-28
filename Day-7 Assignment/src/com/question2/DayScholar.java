package com.question2;

public class DayScholar extends Student{

	   double transportFee;
			
		DayScholar(int studId,String studName,double examFee,double transportFee){
			super(studId, studName, examFee);
			this.transportFee=transportFee;
			
		}
		
		 public void displayDetails2(){
			 super.displayDetails();
			System.out.println("Transportation Fees:"+transportFee);
			System.out.println();
			
			}
		 
		 

}
