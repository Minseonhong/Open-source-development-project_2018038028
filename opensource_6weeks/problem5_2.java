package problem_6weeks;
import java.util.Scanner;

class TV {
	private int size;
	public TV(int size) { this.size = size; }
	protected int getSize() { return size; }
}

class ColorTV extends TV {
	private int color;
	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}
	protected int getColor() { return color; }
	public void printProperty() {
		System.out.println(getSize()+"인치 "+getColor()+"컬러");
	}
}

class IPTV extends ColorTV {
	private String IP;
	public IPTV(String IP, int size, int color) {
		super(size, color);
		this.IP = IP;
	}
	protected String getIP() { return IP; }
	public void printProperty() {
		System.out.print("나의 IPTV는 "+getIP()+" 주소의 ");
		super.printProperty();
	}
}

public class problem5_2{
	public static void main(String args[]) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048); 
		iptv.printProperty();
	}
}

abstract class Converter {
	abstract protected double convert(double src); 
	abstract protected String getSrcString(); 
	abstract protected String getDestString(); 
	protected double ratio;
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString()+"을 "+getDestString()+"로 바꿉니다.");
		System.out.print(getSrcString()+"을 입력하세요>> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("변환 결과: "+res+getDestString()+"입니다");
		scanner.close();
	}
}