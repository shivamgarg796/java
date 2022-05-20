package com.day3;

public class VowelAndConsonant {
	
	public void find(char c) {
     if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
    	 System.out.println("vowel");
     }
     else if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
         System.out.println("vowel");
     }
     else if (c=='b'||c=='c'||c=='d'||c=='f'||c=='g'||c=='h'||c=='j'||c=='k'||c=='l'||c=='m'||c=='n'||c=='p'||c=='q'||c=='r'||c=='s'||c=='t'||c=='v'||c=='w'||c=='x'||c=='y'||c=='z') 
     {
    	 System.out.println("consonants");
     }
	else if (c=='B'||c=='C'||c=='D'||c=='F'||c=='G'||c=='H'||c=='J'||c=='K'||c=='L'||c=='M'||c=='N'||c=='P'||c=='Q'||c=='R'||c=='S'||c=='T'||c=='V'||c=='W'||c=='X'||c=='Y'||c=='Z') 
	{
   	 System.out.println("consonants");
    }
	else {
		System.out.println("Invalid Character");
	}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VowelAndConsonant vc=new VowelAndConsonant();
		vc.find('A');
		vc.find('b');
		vc.find('*');
		
	}

}
