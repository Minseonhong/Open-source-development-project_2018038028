package problem;

import java.util.Scanner;

public class problem16 {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		
		String str[]= {"����","����","��"};
		String user;
		do {
			System.out.print("���� ���� ��!>>");
			user=scan.next();
			if(user.equals("�׸�")) {
				System.out.println("������ �����մϴ�...");
				break;
			}
			
			
			int n=(int)(Math.random()*3);
			int user_num=3;
			for(int i=0;i<str.length;i++)
				if(str[i].equals(user))
					user_num=i;
			
			if(user_num==0) {
				if(n==0)
					System.out.println("�����="+str[user_num]+", ��ǻ��="+str[n]+" �����ϴ�.");
				else if(n==1)
					System.out.println("�����="+str[user_num]+", ��ǻ��="+str[n]+" ��ǻ�Ͱ� �̰���ϴ�.");
				else
					System.out.println("�����="+str[user_num]+", ��ǻ��="+str[n]+" ����ڰ� �̰���ϴ�.");
			}else if(user_num==1) {
				if(n==0)
					System.out.println("�����="+str[user_num]+", ��ǻ��="+str[n]+" ����ڰ� �̰���ϴ�.");
				else if(n==1)
					System.out.println("�����="+str[user_num]+", ��ǻ��="+str[n]+" �����ϴ�.");
				else
					System.out.println("�����="+str[user_num]+", ��ǻ��="+str[n]+" ��ǻ�Ͱ� �̰���ϴ�.");
			}else if(user_num==2) {
				if(n==0)
					System.out.println("�����="+str[user_num]+", ��ǻ��="+str[n]+" ��ǻ�Ͱ� �̰���ϴ�.");
				else if(n==1)
					System.out.println("�����="+str[user_num]+", ��ǻ��="+str[n]+" ����ڰ� �̰���ϴ�.");
				else
					System.out.println("�����="+str[user_num]+", ��ǻ��="+str[n]+" �����ϴ�.");
			}else {
				System.out.println("�ٽ� �Է����ּ���.");
			}
			
		}while(user!="�׸�");
	}
}