package Opensource2;

import java.util.Scanner;

public class problem6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		int a =1;
		int b;
		
		System.out.print("1~99 사이의 정수를 입력하시오>>");
		num = sc.nextInt();
		
		b = num %10;
		
		if(num>=10)
		{
			a = num / 10;
			if(num%10 == 0)
			{
				b = -1;
			}
		}
		
		System.out.print("박수");
		if(a%3 == 0)
		{
			System.out.print("짝");
		}
		if(b%3 == 0)
			System.out.print("짝");

	}

}
