package Opensource2;

import java.util.Scanner;

public class problem12_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a ,c, d;
		String b;
		System.out.print("연산>>");
		a = sc.nextDouble();
		b = sc.next();
		c = sc.nextDouble();
		
		switch(b) {
		case "+" :
			d =  a + c;
			System.out.print(a+b+c+"의 계산 결과는 "+d);
			break;
		case "-" :
			d =  a - c;
			System.out.print(a+b+c+"의 계산 결과는 "+d);
			break;
		case "*" :
			d =  a * c;
			System.out.print(a+b+c+"의 계산 결과는 "+d);
			break;
		case "/" :
			if(c==0)
			{
				System.out.print("0으로 나눌 수 없습니다.");
				break;
			}
			else{
				d =  a / c;
				System.out.print(a+b+c+"의 계산 결과는 "+d);
				break;
			}
		}
	}

}
