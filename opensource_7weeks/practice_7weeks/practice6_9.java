package practice_7weeks;

import java.util.StringTokenizer;

public class practice6_9 {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("ȫ�浿/��ȭ/ȫ��/����/����", "/");
		while (st.hasMoreTokens())
		System.out.println(st.nextToken());
	}
}
