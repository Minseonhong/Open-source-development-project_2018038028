package Opensource2;

import java.util.Scanner;

public class problem12_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a ,c, d;
		String b;
		System.out.print("����>>");
		a = sc.nextDouble();
		b = sc.next();
		c = sc.nextDouble();
		
		if(b.equals("+"))
		{
			d = a + c;
			System.out.print(a+b+c+"�� ��� ����� " +d);
		}
		else if(b.equals("-"))
		{
			d = a - c;
			System.out.print(a+b+c+"�� ��� �����" +d);
		}
		else if(b.equals("*"))
		{
			d = a * c;
			System.out.print(a+b+c+"�� ��� �����" +d);
		}
		else if(b.equals("/"))
		{
			if(c==0)
			{
				System.out.print("0���δ� ���� �� �����ϴ�.");
			}
			else
			{
				d = a / c;
				System.out.print(a+b+c+"�� ��� �����" +d);
			}
		}
	}

}
