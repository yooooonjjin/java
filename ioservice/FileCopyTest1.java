package ioservice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyTest1 {

	public static void main(String[] args) throws IOException {

		String filePath1 = "c:/mytemp/post1.csv";
		String filePath2 = "c:/mytemp/post1.txt.back";
		//String filePath1 = "c:/mytemp/Test5.java";
		//String filePath2 = "c:/mytemp/Test5.java.back";
		
		// filePath1 읽어들임/출력
		// 츨력 내부에 write() 기능을 넣음
		
		FileReader file = new FileReader(filePath1);
		BufferedReader buffer = new BufferedReader(file);
		
		FileWriter fw = new FileWriter(filePath2,true);
		
		while(true) {
			String str = buffer.readLine();
			
			if( str == null ) break;
			fw.write(str + "\n");
		}
		fw.close();
		buffer.close();
		file.close();
		System.out.println( "** 내용 카피 완료 **" );
	} 

}
