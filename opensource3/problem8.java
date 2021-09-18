package problem;

import java.util.Scanner;

public class problem8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 몇 개?");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		int i = 0;
		int same = 0;
		while(i<n)
		{
			int rand = (int)(Math.random()*100+1);
			for(int j = 0; j<arr.length;j++)
			{
				if(arr[j]==rand)
				{
					same=1;
					break;
				}
			}
			if(same==1)
			{
				same=0;
				continue;
			}
			arr[i++]=rand;
		}
		for(int k = 0; k<arr.length;k++)
		{
			System.out.print(arr[k]+" ");
		}
	}
}
