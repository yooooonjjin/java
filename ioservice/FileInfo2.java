package ioservice;

import java.io.File;
import java.util.Calendar;

public class FileInfo2 {

	public static void main(String[] args) {
		
		String filepath = "c:/mytemp/test1.txt";
		File file = new File(filepath);
		
		// test1.txt - 파일명
		System.out.println( "파일 이름 : " + file.getName() );			
		
		// 10 - 크기(바이트)
		System.out.println( "파일 크기 : " + file.length() + "byte" );		
		
		// true - 존재여부
		System.out.println( "존재 여부 : " + ((file.exists())?"존재":"미존재") );		
		
		// c:\mytemp\test1.txt - 파일경로
		System.out.println( "파일 경로 : " + file.getPath() );		
		
		// true - 파일인지에 대한 여부
		System.out.println( "파일 여부 : " + ((file.isFile())?"파일":"파일 아님") );		
		
		// false - 폴더인지에 대한 여부
		System.out.println( "폴더 여부 : " + ((file.isDirectory())?"폴더":"폴더 아님") );
		
		// 1740462590978 - 마지막 수정 날짜
		//System.out.println( "수정 날짜 : " + file.lastModified() );	
		long unix = file.lastModified();
		
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis( unix );
		
		int yy = cal.get(Calendar.YEAR);
		int mm = cal.get(Calendar.MONTH) + 1;
		int dd = cal.get(Calendar.DATE);
		
		System.out.println( "수정 날짜 : " + yy + "-" + mm + "-" + dd );
		
		
		System.out.println();
	}

}
