package ioservice;

import java.io.File;
import java.text.SimpleDateFormat;

public class DirList2 {

	public static void main(String[] args) {

		String dirPath = "C:/eclipse1004/eclipse";
		File dir = new File(dirPath);
		
		File[] names = dir.listFiles();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		
		for( int i=0; i<names.length; i++ ) {
			String str = "<폴더>";
			
			//if( names[i].isDirectory() ) {
			if( names[i].isDirectory() == true ) {
				String name = names[i].getName();
				int len = (int)names[i].length();
				int len2 = len/1024;
				long unix = names[i].lastModified();
				String date = df.format(unix);
				System.out.println(str+" "+name+" "+len2+" "+date);
			}
		}
		
		for( int i=0; i<names.length; i++ ) {
			String str = "[파일]";
			//if( !names[i].isDirectory() ) {
			if( names[i].isDirectory() == false ) {
				String name = names[i].getName();
				int len = (int)names[i].length();
				int len2 = len/1024;
				long unix = names[i].lastModified();
				String date = df.format(unix);
				System.out.println(str+" "+name+" "+len2+" "+date);
			}
		}
	}
}