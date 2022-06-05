package com.question2;

public class HistoryStudent extends Student {

	int historyMarks;
	int civicsMarks;
	
	
	public HistoryStudent(String name, String address, int historyMarks, int civicsMarks) {
		super(name, address);
		this.historyMarks = historyMarks;
		this.civicsMarks = civicsMarks;
	}
	
	public int getHistoryMarks() {
		return historyMarks;
	}
	public void setHistoryMarks(int historyMarks) {
		this.historyMarks = historyMarks;
	}

	public int getCivicsMarks() {
		return civicsMarks;
	}
	public void setCivicsMarks(int civicsMarks) {
		this.civicsMarks = civicsMarks;
	}

	@Override
	public float getPercentage() {
		int marksobtained=getHistoryMarks()+getCivicsMarks();
		float percent=(marksobtained/200)*100;
		return percent;
	}
	

}
