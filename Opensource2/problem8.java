package Opensource2;

import java.util.Scanner;

public class problem8 {
	
	public static boolean inRect(int x, int y)
	{
		if ((x >= 100 && x <= 200) && (y >= 100 && y <= 200))
		{
			return true;
		}
		else return false;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int x1, y1;
		int x2, y2;
		boolean a,b;
		
		System.out.print("�� (x1,y1)�� ��ǥ�� �Է��Ͻÿ�>>");
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		System.out.print("�� (x2,y2)�� ��ǥ�� �Է��Ͻÿ�>>");
		x2 = sc.nextInt();
		y2 = sc.nextInt();
		
		a = inRect(x1,y1);
		b = inRect(x2,y2);
		
		if(a==true || b == true)
		{
			System.out.print("�� �簢���� �浹�մϴ�.");
		}
		else {
			System.out.print("�� �簢���� �浹���� �ʽ��ϴ�.");
		}
	}
	

}
