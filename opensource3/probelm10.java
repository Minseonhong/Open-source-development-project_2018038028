package problem;

public class probelm10 {

	public static void main(String[] args) {
		int arr[][] = new int [4][4];
		int isFull[] = new int [6];
		
		int c= 0;
		int same = 0;
		while(c<6)
		{
			int i = (int)(Math.random()*3);
			int j = (int)(Math.random()*3);
			int num = i*10*j;
			for(int n = 0; n<isFull.length; n++)
			{
				if(isFull[n]==num)
				{
					same=1;
					break;
				}
			}
			arr[i][j] = 1;
			isFull[c++] = num;
		}
		for(int i = 0; i<4; i++)
		{
			for(int j = 0; j<4; j++)
			{
				if(arr[i][j] == 1)
				{
					arr[i][j] = 0;
					continue;
				}
				arr[i][j]=(int)(Math.random()*10*1);
			}
		}
		for(int i = 0; i<4; i++)
		{
			for(int j = 0; j <4; j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
	}

}
