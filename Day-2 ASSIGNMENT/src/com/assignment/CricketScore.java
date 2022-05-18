package com.assignment;

public class CricketScore {

	static int score(int arr[]) {
		
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
		
			sum=sum+arr[i];
		
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		
		int arr[]= {1,4,6,1,2};
		
		int result=score(arr);
		
		System.out.println(result);
		
	}

}
