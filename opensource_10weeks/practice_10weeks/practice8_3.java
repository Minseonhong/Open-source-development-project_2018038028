package practice_10weeks;

import java.io.*;

public class practice8_3 {
	public static void main(String[] args) {
		InputStreamReader in = null;
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("C:\\\\Users\\\\�μ�ȫ\\\\Desktop\\\\�μ�ȫ\\\\���б� ����\\\\2�г� 2�б�\\\\���¼ҽ�����������Ʈ\\\\�ǽ�����\\\\OpenSource\\\\opensource_10weeks\\\\practice_10weeks\\\\hangul.txt");
			in = new InputStreamReader(fin, "US-ASCII");
			int c;
			System.out.println("���ڵ� ���� ������ " + in.getEncoding());
			while ((c = in.read()) != -1) {
				System.out.print((char) c);
			}
			in.close();
			fin.close();
		} catch (IOException e) {
			System.out.println("����� ����");
		}
	}

}
