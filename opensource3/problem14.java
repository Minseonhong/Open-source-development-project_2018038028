package problem;

import java.util.Scanner;

public class problem14 {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		String course[]= {"Java","C++","HTML5","컴퓨터구조","안드로이드"};
		int score[]= {95,88,76,62,55};
		
		String str;
		int i;
		do {
			System.out.print("과목 이름>>");
			str=scan.next();
			if(str.equals("그만"))
				break;
			for(i=0;i<course.length;i++) {
				if(course[i].equals(str)) {
					System.out.println(str+"의 점수는 "+score[i]);
					break;
				}
			}
			if(i==course.length)
				System.out.println("없는 과목입니다.");
		}while(str!="그만");
	}
}