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
        System.out.println("\t현재 초 시간 = " + now.get(Calendar.SECOND));
 
        System.out.print("10초 예상 후 <Enter>키 >> ");
        scanner.nextLine();
        after = Calendar.getInstance();
        System.out.println("\t현재 초 시간 = " + after.get(Calendar.SECOND));
 
        return (after.get(Calendar.MINUTE)*60 + after.get(Calendar.SECOND)) - (now.get(Calendar.MINUTE)*60 + now.get(Calendar.SECOND));
    }
}

public class problem6_6 {
	public static void main(String[] args){
        Game g = new Game();
        int count1, count2;
        int result1, result2;
 
        System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
 
        System.out.print("황기태 시작 <Enter>키 >> ");
        count1 = g.run();
        result1 = Math.abs(count1 - 10);
 
        System.out.print("이재문 시작 <Enter>키 >> ");
        count2 = g.run();
        result2 = Math.abs(count2 - 10);
 
        System.out.println("황기태의 결과 " + count1 + ", 이재문의 결과 " + count2);
        if(result1 > result2){
            System.out.println("승자는 이재문");
        }
        else if(result1 < result2){
            System.out.println("승자는 황기태");
        }
        else{
            System.out.println("비겼습니다.");
        }
    }
}
