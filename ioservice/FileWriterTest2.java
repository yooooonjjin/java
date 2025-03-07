package ioservice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterTest2 {

	public static void main(String[] args) throws IOException  {
		
		Scanner scn = new Scanner(System.in);
		String filePath = "c:/mytemp/test102.txt";
		System.out.println("내용 : ");
		String text = scn.next();
		
		FileWriter fw = new FileWriter(filePath,true);
		fw.write(text+"\n");
		fw.close();
		System.out.println("쓰기완료!");

		FileReader file = new FileReader(filePath);
		BufferedReader buffer = new BufferedReader(file);
		while(true) {
			String str = buffer.readLine();
			if( str == null ) break;
			System.out.println(str);
		}
		buffer.close();
		file.close();
		
	}

}
