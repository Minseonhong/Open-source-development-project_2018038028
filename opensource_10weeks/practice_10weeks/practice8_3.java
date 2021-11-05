package practice_10weeks;

import java.io.*;

public class practice8_3 {
	public static void main(String[] args) {
		InputStreamReader in = null;
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("C:\\\\Users\\\\민선홍\\\\Desktop\\\\민선홍\\\\대학교 폴더\\\\2학년 2학기\\\\오픈소스개발프로젝트\\\\실습과제\\\\OpenSource\\\\opensource_10weeks\\\\practice_10weeks\\\\hangul.txt");
			in = new InputStreamReader(fin, "US-ASCII");
			int c;
			System.out.println("인코딩 문자 집합은 " + in.getEncoding());
			while ((c = in.read()) != -1) {
				System.out.print((char) c);
			}
			in.close();
			fin.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}

}
