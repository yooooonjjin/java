package ioservice;

import java.io.File;
import java.util.Scanner;

/**
 * 파일 삭제 실습
 */
public class FileInfoDelete {

	public static void main(String[] args) {
		
//		String dirPath = "c/mytemp";
//		
//		Scanner scn = new Scanner(System.in);
//		
//		System.out.println("파일 이름 : ");
//		String filename = scn.next();
//		
//		File file = new File(filename);
//		
//		if( file.exists() ) {
//			file.delete();
//		} else {
//			System.out.println( "없는 파일입니다." );
//		}
		
		String dirPath = "c:/mytemp";
		Scanner scn = new Scanner(System.in);

		System.out.println( "(삭제) 파일명 : " );
		String filename = scn.next();
		String filePath = dirPath + "/" + filename;

		File file = new File(filePath);
		if( file.exists() ) {
			file.delete();
			System.out.println( filename + " 파일이 삭제 되었습니다.");
		} else {
			System.out.println("존재하지 않는 파일명입니다.");

		}
		

		
		
	}

}
