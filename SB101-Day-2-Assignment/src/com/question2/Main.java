package com.question2;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Main {

	public static void main(String[] args) {

				FileReader fr = null;
				try {
					fr = new FileReader("e://abc.txt");

					int i = fr.read();
					while (i != -1) {
						System.out.print((char) i);
						i = fr.read();
					}
				} catch (FileNotFoundException e) {
					throw new RuntimeException(e);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}

}
