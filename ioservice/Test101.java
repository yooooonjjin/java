package ioservice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test101 {

	public static void main(String[] args) {
		  try {
			    String filepath = "c:/mytemp/index2.html";
	            File file = new File(filepath); // 해당 이름의 파일이 없는 경우 새로 생성, 있는 경우 그 파일을 받아옴
	            BufferedWriter writer = new BufferedWriter(new FileWriter(file));

	            writer.write("" +
	                    "<head>" +
	                        "<meta charset = \"UTF-8\"/>" +
	                        "<style>" +
	                            "table {border-collapse: collapse; width: 100%;}" +
	                            "th, td {border: solid 1px #000;}" +
	                        "</style>" +
	                    "</head>" +
	                    "<body>");

	            writer.write("<h1>자바 환경정보</h1>");
	            writer.write("" +
	                    "<table>" +
	                        "<tr>" +
	                            "<th>키</th>" +
	                            "<th>속성</th>" +
	                        "</tr>");

	            for(Object k : System.getProperties().keySet()){
	                String key = k.toString();
	                String value = System.getProperty(key);
	                writer.write("" +
	                        "<tr>" +
	                            "<td>" + key + "</td>" +
	                            "<td>" + value + "</td>" +
	                        "</tr>");
	            }

	            writer.write("</table>");

	            writer.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	}

}