package problem_7weeks;

import java.util.Calendar;
import java.util.Scanner;

class Game{
    private Scanner scanner;
    Calendar now, after;
    public Game(){
        scanner = new Scanner(System.in);
    }
    public int run(){
        scanner.nextLine();
        now = Calendar.getInstance();
        System.out.println("\t���� �� �ð� = " + now.get(Calendar.SECOND));
 
        System.out.print("10�� ���� �� <Enter>Ű >> ");
        scanner.nextLine();
        after = Calendar.getInstance();
        System.out.println("\t���� �� �ð� = " + after.get(Calendar.SECOND));
 
        return (after.get(Calendar.MINUTE)*60 + after.get(Calendar.SECOND)) - (now.get(Calendar.MINUTE)*60 + now.get(Calendar.SECOND));
    }
}

public class problem6_6 {
	public static void main(String[] args){
        Game g = new Game();
        int count1, count2;
        int result1, result2;
 
        System.out.println("10�ʿ� ����� ����� �̱�� �����Դϴ�.");
 
        System.out.print("Ȳ���� ���� <Enter>Ű >> ");
        count1 = g.run();
        result1 = Math.abs(count1 - 10);
 
        System.out.print("���繮 ���� <Enter>Ű >> ");
        count2 = g.run();
        result2 = Math.abs(count2 - 10);
 
        System.out.println("Ȳ������ ��� " + count1 + ", ���繮�� ��� " + count2);
        if(result1 > result2){
            System.out.println("���ڴ� ���繮");
        }
        else if(result1 < result2){
            System.out.println("���ڴ� Ȳ����");
        }
        else{
            System.out.println("�����ϴ�.");
        }
    }
}
