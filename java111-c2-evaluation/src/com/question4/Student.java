package com.question4;

public class Student extends Person {

	 int studentId;
	 String courseEnrolled ;
	 int courseFee;
	 
	 public void setId(int studentId) {
		 this.studentId=studentId;
	 }
	 public int getId() {
		 return studentId;
	 }
	 
	 public void setCourse(String courseEnrolled ) {
		 this.courseEnrolled=courseEnrolled;
	 }
	 public String getCourse() {
		 return courseEnrolled;
	 }
	 
	 public void setcourseFee(int courseFee) {
		 this.courseFee=courseFee;
	 }
	 public int courseFee() {
		 return courseFee;
	 }
}
