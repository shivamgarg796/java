package com.question1;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		
		int []arr=new int[size];
		
		System.out.println("Enter the elements in the array ");
		for(int i=0;i<size;i++) {
			System.out.println("Enter the" +" "+(i+1)+" "+ "Element");
			arr[i]=sc.nextInt();	
			}
		
//		System.out.println("After entering the elements of the array");
//		for(int i=0;i<size;i++) {
//			System.out.println(arr[i]);
//			}
		
		System.out.println("Enter the index of the array element you want to access");
		int index=sc.nextInt();
			System.out.println("The array element at index "+index+ " "+arr[index]);
					System.out.println("The array element successfully accessed");
		
	}
}
