package Opensource2;

import java.util.Scanner;

public class problem4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.print("���� 3�� �Է�>>");
		
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if((a<b && b<c)||(c<b && b<a))
		{
			System.out.print("�߰� ����" + b);
		}
		else if((b<a && a<c)||(c<a && a<b))
		{
			System.out.print("�߰� ���� " + a);
		}
		else
		{
			System.out.print("�߰� ���� " + c);
		}
	}

}
