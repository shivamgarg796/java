package com.question1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		  FileReader fr= null;
        try {
            fr = new FileReader("e://abc.txt");

        BufferedReader br=new BufferedReader(fr);
        String line=br.readLine();
        while(line != null){
            System.out.println(line);
            line=br.readLine();
        }
        br.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
	}

}
