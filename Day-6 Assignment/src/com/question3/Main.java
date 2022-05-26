package com.question3;
	
	public class Main{
		public int[] findAndReturnPrimeNumbers(int[] inputArray){
		    int n=inputArray.length;
			int[] arr=new int[n];
			for(int i=0;i<n;i++) {
			     int res=findprime(inputArray[i]);
			     if(res==1) {
			     arr[i]=inputArray[i];
			    }
			}
			return arr;
		}
		public int findprime(int n){
			int count=0;
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					count++;
				}
			}
			if(count==0)
				return 1;
			else
				return 0;
		}
		
		public static void main(String[] args){
			int[] arr = {10,12,5,50,11,14,15};
			Main mn=new Main();
		    int[] a=mn.findAndReturnPrimeNumbers(arr);
		    boolean flag=false;
		     for(int itm:a) {
		    	 if(itm>0) {
		    		 System.out.println(itm);
		    		 flag=true;
		    	 }
		     }
		     if(!flag)
		    System.out.println("Prime number not found in the supplied Array");
		}
		}

