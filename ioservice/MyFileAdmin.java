package ioservice;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class MyFileAdmin {
	
	public static String dirPath = "C:/mytemp";
	
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("[ 파일관리 ]\n");
		System.out.println("(1)목록출력  (2)파일생성  (3)파일삭제");
		System.out.print("*메뉴번호>>");
		
		byte menu = 0;
		try {
			menu = scn.nextByte();
		} catch (Exception e) {
			System.out.println("## 번호로 입력해주세요. ##");
			return;
		}
		
		System.out.println("-------------------------");
		
		switch(menu) {
			case 1 :  MyFileAdmin.dirList();
			break;
			case 2 :  MyFileAdmin.createFile();
			break;
			case 3 :  MyFileAdmin.deleteFile();
			break;
			default : System.out.println("## 없는 메뉴번호 입니다. ##");
		}
	}
	public static void dirList() {
		
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
	public static void createFile() {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("(new)파일명>>");
		String filename = scn.next();
		
		String filePath = dirPath+"/"+filename;

		File file = new File(filePath);// 인스턴스처리
		
		if( file.exists() ) {
			System.out.println("** 이미 존재함 **");
		} else {
			try {
				file.createNewFile();
				System.out.println("** 생성완료 ^^ **");
				
				dirList();
				
			} catch(Exception e) {
				// 부정확한 경로(특히 폴더명) 설정 시 발생
				System.out.println("** 생성실패 !! **");
			}
		}
	}
	public static void deleteFile() {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("(삭제)파일명>>");
		String filename = scn.next();
		String filePath = dirPath+"/"+filename;
		// 격노 -> 경로
		File file = new File(filePath);
		
		if( file.exists() ) {
			file.delete();
			System.out.println("** 삭제완료 !! **");
			
			dirList();
			
		} else {
			System.out.println("** 존재하지 않는 파일명 입니다. **");
		}
	}
}