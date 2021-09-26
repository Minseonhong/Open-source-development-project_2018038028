package Opensource2;

import java.util.Scanner;

public class problem4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.print("정수 3개 입력>>");
		
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if((a<b && b<c)||(c<b && b<a))
		{
			System.out.print("중간 값은" + b);
		}
		else if((b<a && a<c)||(c<a && a<b))
		{
			System.out.print("중간 값은 " + a);
		}
		else
		{
			System.out.print("중간 값은 " + c);
		}
	}

}
