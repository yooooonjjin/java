package ioservice;

import java.io.File;

public class FileInfo {

	public static void main(String[] args) {
		// 파일 이름, 생성 날짜, 파일 종류, 파일 크기 
		String filepath = "c:/mytemp/test1.txt";
		File file = new File(filepath);
		
		System.out.println( file.getName() );		// test1.txt 			- 파일명
		System.out.println( file.length() );		// 10 					- 크기(바이트)
		System.out.println( file.exists() );		// true 				- 존재여부
		System.out.println( file.getPath() );		// c:\mytemp\test1.txt 	- 파일경로
		System.out.println( file.isFile() );		// true 				- 파일인지에 대한 여부
		System.out.println( file.isDirectory() );	// false 				- 폴더인지에 대한 여부
		System.out.println( file.lastModified() );	// 1740462590978 		- 마지막 수정 날짜
				
		System.out.println();
		//try {			
		//	file.createNewFile();		// (빈)파일 생성
		//} catch(Exception e) {
		//
		//}
		
		//file.delete();				//파일 삭제
		
		//file.listFiles();				//파일 목록 정보
		
		File file1 = new File( "c:/mytemp/java" );
		file1.mkdir();					//폴더 생성
			
		
		
		
		
	}

}
