package pratice_4weeks;

class cir
{
	int radius;
	public cir(int radius)
	{
		this.radius = radius;
	}
	public double getArea()
	{
		return 3.14 *radius * radius;
	}
}

public class CircleArray {
	public static void main(String[] args) {
		cir [] c;
		c = new cir[5];
		
		for(int i =0; i<c.length; i++)
		{
			c[i] = new cir(i);
		}
		
		for(int i = 0; i<c.length; i++)
		{
			System.out.print((int)(c[i].getArea()) + " ");
		}
	}
}
