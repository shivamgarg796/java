package com.question2;
import java.util.Scanner;
public class Mobile {

	String[] outdatedModels = {"note4","note5","note6","note7"};
	
	
	public  void searchOutdatedModel(String name, String... model){
       System.out.println("The mobile Company is :"+name);
		for(String i : model) {
			for(int j=0; j<outdatedModels.length; j++) {
				if(i==outdatedModels[j]) {
					System.out.println(outdatedModels[j]+"_OUTDATED");
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		Mobile m=new Mobile();
		
		m.searchOutdatedModel("Redmi","note8","note4","note9","note6");
	}
}
