package ioservice;

import java.io.File;
import java.util.Scanner;

/**
 * 파일 생성 관련 실습
 */
public class FileInfo3 {

	public static void main(String[] args) {
		//디렉토리(리눅스용어) 경로
		String dirPath = "c:/mytemp";
		Scanner scn = new Scanner(System.in);
		
		System.out.println( "(new) 파일명 : " );
		String filename = scn.next();
		String filePath = dirPath + "/" + filename;
		
		File file = new File(filePath);
		if( file.exists() ) {
			System.out.println( "** 이미 존재함 **" );
		} else {
			try {				
				file.createNewFile();
				System.out.println("** 생성 완료 ^^ **");
			} catch(Exception e) {
				// 부정확한 경로(툭히 폴더명) 설정 시 발생
				System.out.println("** 생성 실패 !! **");
			}
		
		}
		
		
		
	}

}
