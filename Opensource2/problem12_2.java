package Opensource2;

import java.util.Scanner;

public class problem12_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a ,c, d;
		String b;
		System.out.print("����>>");
		a = sc.nextDouble();
		b = sc.next();
		c = sc.nextDouble();
		
		switch(b) {
		case "+" :
			d =  a + c;
			System.out.print(a+b+c+"�� ��� ����� "+d);
			break;
		case "-" :
			d =  a - c;
			System.out.print(a+b+c+"�� ��� ����� "+d);
			break;
		case "*" :
			d =  a * c;
			System.out.print(a+b+c+"�� ��� ����� "+d);
			break;
		case "/" :
			if(c==0)
			{
				System.out.print("0���� ���� �� �����ϴ�.");
				break;
			}
			else{
				d =  a / c;
				System.out.print(a+b+c+"�� ��� ����� "+d);
				break;
			}
		}
	}

}
