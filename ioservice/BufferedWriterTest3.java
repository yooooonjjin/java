package ioservice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class BufferedWriterTest3 {

	public static String filePath = "c:/mytemp/member_db.txt";
	
	public static void main(String[] args) throws Exception {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("{ 학생정보관리 }");
		System.out.println("1.학생정보등록");
		System.out.println("2.학생정보출력");
		System.out.println("3.학생정보검색");
		System.out.println("4.학생정보삭제");
		System.out.println("5.일괄등록처리");
		System.out.print("*메뉴번호>>");
		
		int menu = scn.nextInt();
		switch(menu) {
			case 1 : setMemberInfo();
			break;
			case 2 : getMemberInfo();
			break;
			case 3 : searchMemberInfo();
			break;
			case 4 : delMemberInfo();
			break;
			case 5 : inputBatch();
			break;
			default : System.out.println("*없는번호*");
		}
	}
	public static void setMemberInfo() throws Exception {
		Scanner scn = new Scanner(System.in);
		FileWriter fw = new FileWriter(filePath,true);
		BufferedWriter buffer = new BufferedWriter(fw);
		// 이름  생년월일  연락처
		String data = "";
		while(true) {
			System.out.print("학생정보등록(완료:\".\")>>");
			String text = scn.next();
			if( text.equals(".") ) {
				System.out.print("**보관함의 내용을 저장하시겠습니까?(Y/N)>>");
				String yn = scn.next();
				if( yn.toUpperCase().equals("Y") ) {
					break;
				} else {
					continue;
				}
			}
			data += text;
			data += "\n";
			System.out.println("-보관함에 넣음- \n");
		}
		buffer.write(data);
		buffer.close();
		System.out.println("\n-- 저장완료 --");
	}
	public static void getMemberInfo() throws Exception {
		
		FileReader file = new FileReader(filePath);
		BufferedReader buffer = new BufferedReader(file);
		
		while( true ) {
			String str = buffer.readLine();
			if( str == null ) break;
			System.out.println(str);
		}
	}
	
	public static void inputBatch() throws Exception {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("*파일명>>");
		String name = scn.next();
		String path = "c:/mytemp/"+name;
		File f = new File(path);
		if( f.exists() == false ) {
			System.out.println("파일명을 다시 확인해주세요!");
			return;
		}
		FileReader file = new FileReader(path);
		BufferedReader buffer = new BufferedReader(file);
		String datas = "";
		while( true ) {
			String str = buffer.readLine();
			
			if( str == null ) break;
			
			str = str.trim();
			datas += str+"\n";
		}
		if( datas.equals("") ) {
			System.out.println("- 입력할 데이터가 없습니다. -");
			return;
		}
		buffer.close();
		file.close();

		FileWriter fw = new FileWriter(filePath,true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(datas);
		bw.close();
		fw.close();
		
		System.out.println("- 일괄처리완료 -");
	}
	
	public static void searchMemberInfo() throws Exception {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("*학생명>>");
		String searchWord = scn.next();
		
		FileReader file = new FileReader(filePath);
		BufferedReader buffer = new BufferedReader(file);
		
		int cnt = 0;
		while( true ) {
			String str = buffer.readLine();
			if( str == null ) break;
			if( str.indexOf(searchWord) > -1  ) {
				System.out.println(str);
				cnt++;
			}
		}
		if(cnt == 0) {
			System.out.println("-" + searchWord+"의 정보는 없습니다.-");
		}
	}
	public static void delMemberInfo() throws Exception {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("*(삭제)학생명>>");
		String searchWord = scn.next();
		
		FileReader file = new FileReader(filePath);
		BufferedReader buffer = new BufferedReader(file);
		
		int cnt = 0;
		String datas = "";
		
		while( true ) {
			String str = buffer.readLine();
			if( str == null ) break;
			if( str.indexOf(searchWord) > -1  ) {
				cnt++;
			} else {
				datas += str+"\n";
			}
		}
		if(cnt == 0) {
			System.out.println("-" + searchWord+"의 정보는 없습니다.-");
		} else {
			FileWriter fw = new FileWriter(filePath,false);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(datas);
			bw.close();
			fw.close();
			System.out.println("-" + searchWord+"의 정보가 삭제되었습니다.-");
		}
	}
}