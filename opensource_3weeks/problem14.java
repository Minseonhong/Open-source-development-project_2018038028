package problem;

import java.util.Scanner;

public class problem14 {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		String course[]= {"Java","C++","HTML5","��ǻ�ͱ���","�ȵ���̵�"};
		int score[]= {95,88,76,62,55};
		
		String str;
		int i;
		do {
			System.out.print("���� �̸�>>");
			str=scan.next();
			if(str.equals("�׸�"))
				break;
			for(i=0;i<course.length;i++) {
				if(course[i].equals(str)) {
					System.out.println(str+"�� ������ "+score[i]);
					break;
				}
			}
			if(i==course.length)
				System.out.println("���� �����Դϴ�.");
		}while(str!="�׸�");
	}
}