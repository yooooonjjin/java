package ioservice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class FileReaderExample {

	
	public static void dirList(String dirPath) {
		
		File dir = new File(dirPath);
		File[] names = dir.listFiles();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println("** 목록출력 **");
		
		for( int i=0; i<names.length; i++ ) {
			String str = "[파일]";
			if( names[i].isDirectory() ) str = "<폴더>";
			String name = names[i].getName();
			int len = (int)names[i].length();
			int len2 = len/1024;
			long unix = names[i].lastModified();
			String date = df.format(unix);
			System.out.println(str+" "+name+" "+len2+" "+date);
		}
		if( names.length == 0 ) {
			System.out.println("\n** 출력 내용이 없습니다.");
		}
	}
	
	public static void main(String[] args) {

		String dirPath = "C:\\eclipse-workspace7\\sample1\\src\\study1";
		dirList(dirPath);
		
		Scanner scn = new Scanner(System.in);
		System.out.print("읽어들일 파일명>>");
		String filename = scn.next();
		
		String filePath = dirPath+"\\"+filename;
		
		try {
			FileReader file = new FileReader(filePath);
			BufferedReader buffer = new BufferedReader(file);
			while(true) {
				String str = buffer.readLine();
				if( str == null ) break;
				System.out.println(str);
			}
			buffer.close();
			file.close();
		} catch(Exception e) { 
			System.out.println("** 없는 파일명 입니다. **");
		}
		
	}
}