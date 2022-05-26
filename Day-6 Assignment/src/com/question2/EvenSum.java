package com.question2;

public class EvenSum {

	static int[][] arr = { { 1, 2 ,3}, 
					       { 4, 5, 6},
					       { 7, 8, 9}
					};
	
		public static void main(String[] args) {
			for (int i=0;i<=2;i++) {
				
				int sum=0;
				for(int j=0;j<=2;j++) {
					if(arr[j][i]%2==0) {
						sum+=arr[j][i];
					}
				}
				System.out.println(sum);
				
			}
		}
}
