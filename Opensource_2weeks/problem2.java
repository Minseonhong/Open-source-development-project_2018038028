package Opensource2;

import java.util.Scanner;

public class problem2 {

	public static void main(String[] args) {
		System.out.print("2�ڸ��� ���� �Է�(10~99)");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if(num % 11 == 0)
		{
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		}
		else
			System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");

	}

}
