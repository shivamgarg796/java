package com.question2;

public class ScienceStudent extends Student{

		int phisicsMarks;
		int chemistryMarks;
		int mathsMarks;
		
		
		
		public ScienceStudent(String name, String address, int phisicsMarks, int chemistryMarks, int mathsMarks) {
			super(name, address);
			this.phisicsMarks = phisicsMarks;
			this.chemistryMarks = chemistryMarks;
			this.mathsMarks = mathsMarks;
		}
		
		public int getPhisicsMarks() {
			return phisicsMarks;
		}
		public void setPhisicsMarks(int phisicsMarks) {
			this.phisicsMarks = phisicsMarks;
		}
		
		
		public int getChemistryMarks() {
			return chemistryMarks;
		}
		public void setChemistryMarks(int chemistryMarks) {
			this.chemistryMarks = chemistryMarks;
		}

		public int getMathsMarks() {
			return mathsMarks;
		}
		public void setMathsMarks(int mathsMarks) {
			this.mathsMarks = mathsMarks;
		}

		@Override
		 public float getPercentage(){
			int marksobtained=getPhisicsMarks()+getChemistryMarks()+getMathsMarks();
			float percent=(marksobtained/300)*100;
			return percent;
		}
		
}
