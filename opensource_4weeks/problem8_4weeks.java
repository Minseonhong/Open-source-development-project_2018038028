package problem;
import java.util.Scanner;

class Phone {
	
	private String name;
	private String phoneNumber;
	
	Phone (String name, String phoneNumber) { 
		this.name=name;
		this.phoneNumber=phoneNumber;
	}
	
	boolean getNumber (String name) { 
		if (this.name.equals(name)) {
			System.out.println(name+"�� ��ȣ�� "+this.phoneNumber+" �Դϴ�.");
			return true;
		}
		else
			return false;
	}
}

public class problem8_4weeks {
	
	private Phone phone[];
	int i;
	boolean tf;
	
	problem8_4weeks (int num) { 
		phone=new Phone[num];
	}
	
	void bookSet (int num, String name, String phoneNumber) { 
		phone[num]=new Phone(name,phoneNumber);
	}
	
	void show (String name) { 
		for(i=0;i<this.phone.length;i++) {
			tf=phone[i].getNumber(name);
			if (tf==true)
				break;
		}
		if (i==this.phone.length)
			System.out.println(name+" �� �����ϴ�.");
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int num;
		String name;
		String phoneNumber;
		
		System.out.print("�ο���>>");
		num=scan.nextInt();
		problem8_4weeks phoneBook=new problem8_4weeks(num); 
		
		for(int i=0;i<num;i++) {
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
			name=scan.next();
			phoneNumber=scan.next();
			phoneBook.bookSet(i,name,phoneNumber); 
		}
		System.out.println("����Ǿ����ϴ�...");
		
		while(true) {
			System.out.print("�˻��� �̸�>>");
			name=scan.next();
			if (name.equals("�׸�"))
				break;
			phoneBook.show(name);
		}
	}

}