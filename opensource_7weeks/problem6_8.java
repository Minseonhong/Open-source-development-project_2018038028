package problem_7weeks;

import java.util.Scanner;

public class problem6_8 {
	 public static void main(String[] args){
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("���ڿ��� �Է��ϼ���. ��ĭ�� �־ �ǰ� ���� �ѱ� ��� �˴ϴ�.");
	        String str = scanner.nextLine();
	        for(int i=0; i<=str.length(); i++){
	            System.out.print(str.substring(i));
	            System.out.println(str.substring(0, i));
	        }
	        scanner.close();
	  }
}
