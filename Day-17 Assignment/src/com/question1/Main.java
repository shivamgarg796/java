package com.question1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Song s1 = new Song("koimilgaya", "kmg");
		Song s2 = new Song("koimilgaya", "kmg");
		Song s3 = new Song("sangam", "kgs");
		Song s4 = new Song("badal", "spl");

		PlayList pl = new PlayList();
//		System.out.println("How many song you wish to entered !");
//		int song=sc.nextInt();
//		
//		for(int i=0;i<song;i++) {
//		System.out.println("Enter the" +" "+(i+1)+" "+"song");
//		String song1=sc.next();
//		
//		System.out.println("Enter the movei name of this song");
//		String movei=sc.next();

		pl.addSong(s1);
		pl.addSong(s2);
		pl.addSong(s3);
		pl.addSong(s4);

		for (Song s : pl.songs) {
			s.play();
		}

	}

}
