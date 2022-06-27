package com.question1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc =new Scanner(System.in);
		List<Product> lp=new ArrayList();

		System.out.println("Enter the number of products you want to add :");
		int num=sc.nextInt();
		
		for(int i=0 ; i<num ;i++) {
			System.out.println("Enter the details of"+" "+(i+1)+" "+"Product");
		
		System.out.println("Enter the Product Id :");
		int id=sc.nextInt();
		
		System.out.println("enter the name of product :");
		String name=sc.next();
		
		System.out.println("Enter the price of the product");
		double price=sc.nextDouble();
		
		
		Product s1=new Product(id, name, price);
		lp.add(s1);
		}
		
		
		System.out.println("=====================================");
		System.out.println("Press 1 for sorting the product according to the productPrice");
		
		System.out.println("Press 2 for sorting the product according to the productName");
		
		System.out.println("Press 3 for sorting the product according to the productId");
		
		int ch=sc.nextInt();
		
		switch (ch) {
		case 1:
		{
		Collections.sort(lp,new ProductPriceSort());
		System.out.println(lp);
		break;
		}
			
		case 2:
		{
			Collections.sort(lp);
			System.out.println(lp);
		
		break;
		}
		case 3:
		{
			Collections.sort(lp,new ProductIdSort());
			System.out.println(lp);
			break;	
		}
			
		default :
			Collections.sort(lp,new ProductIdSort());
			System.out.println(lp);
		}
		
	}

}
