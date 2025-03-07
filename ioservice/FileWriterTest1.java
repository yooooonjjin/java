package ioservice;

import java.io.FileWriter;
import java.util.Scanner;

public class FileWriterTest1 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		
		String filePath = "c:/mytemp/test101.txt";
		try {
			// 덮어쓰기
			// false = 덮어쓰기, true = 이어쓰기
			FileWriter fw = new FileWriter(filePath,true);
			System.out.println("내용 : ");
			String text = scn.next();
			fw.write(text+"\n");
			fw.close();
			System.out.println("쓰기완료!");
		} catch( Exception e ) {
			System.out.println( e.toString() );
		}
		

	}

}
