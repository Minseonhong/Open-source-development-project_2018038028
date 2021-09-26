package problem;

import java.util.Scanner;

public class problem6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int []unit = {50000,10000,5000,1000,500,100,50,10,1};
		System.out.print("금액을 입력하시오>>");
		int m = sc.nextInt();
		
		int i = 0;
		int n;
		while(m>0)
		{
			n = m/unit[i];
			if(n==0)
			{
				i++;
				continue;
			}
			System.out.println(unit[i] + "원 짜리: " + n +"개");
			m=m-n*unit[i];
			i++;
		}

	}

}
