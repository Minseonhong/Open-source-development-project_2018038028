package problem;
import java.util.Scanner;

class Circle_2{
	private double x,y;
	private int radius;
	public Circle_2(double x, double y, int radius)
	{
		this.x = x; this.y = y; this.radius = radius;
	}
	public void show()
	{
		System.out.println("가장 면적이 큰 원은 (" + x + "," + y + ")" + radius);
	}
	public int getradius() {return radius;}
}

public class problem6_4weeks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circle_2 c [] = new Circle_2[3];
		for(int i = 0 ; i<3; i++)
		{
			System.out.print("x, y, radius >>");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			int radius = sc.nextInt();
			c[i] = new Circle_2(x,y,radius);
		}
		
		int max = 0;
		for(int i = 0; i<c.length; i++)
		{
			if((c[i].getradius()) > (c[max].getradius()))
				max = i;
		}
		c[max].show();
	}
}
