package practice_10weeks;

import java.io.*;

public class practice8_1 {
	public static void main(String[] args) {
		FileReader fin = null;
		try {
		fin = new FileReader("c:\\windows\\system.ini");
		int c;
		while ((c = fin.read()) != -1) { 
		System.out.print((char)c);
		}
		fin.close();
		}
		catch (IOException e) {
		System.out.println("����� ����");
		}
	}
}
