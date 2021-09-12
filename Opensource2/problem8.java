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
		
		System.out.print("점 (x1,y1)의 좌표를 입력하시오>>");
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		System.out.print("점 (x2,y2)의 좌표를 입력하시오>>");
		x2 = sc.nextInt();
		y2 = sc.nextInt();
		
		a = inRect(x1,y1);
		b = inRect(x2,y2);
		
		if(a==true || b == true)
		{
			System.out.print("두 사각형은 충돌합니다.");
		}
		else {
			System.out.print("두 사각형은 충돌하지 않습니다.");
		}
	}
	

}
