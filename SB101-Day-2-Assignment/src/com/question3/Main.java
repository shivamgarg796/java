package com.question3;

import java.io.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name");
		String name = sc.next();
		System.out.println("Enter the character to be counted");
		char c = sc.next().charAt(0);
		FileReader fr = null;
		try {
			fr = new FileReader(name);

			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			int count = 0;
			while (line != null) {
				for (int i = 0; i < line.length(); i++) {
					if (line.charAt(i) == c) {
						count++;
					}
				}

				line = br.readLine();
			}
			System.out.println(count);
			br.close();
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
