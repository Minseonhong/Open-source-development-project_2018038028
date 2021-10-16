package problem_7weeks;

import java.util.*;
class Person{
    private String name;
    public Person(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}

public class problem6_12 {
	public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
 
        int num[] = new int[3];
        boolean flag = true;
        int total = 0;
        int max = 0;
        int count = 0;
 
        System.out.print("겜블링 게임에 참여할 선수 숫자>>");
        count = scanner.nextInt();
        Person person[] = new Person[count];
 
        for(int i=0; i<person.length; i++){
            System.out.print(i+1 + "번째 선수 이름>>");
            person[i] = new Person(scanner.next());
        }
        scanner.nextLine();
 
        while(flag){
            for(int i=0; i<person.length; i++){
                System.out.print("["+person[i].getName()+"]:<Enter>");
                scanner.nextLine();
                for(int j=0; j<num.length; j++){
                    num[j] = (int)(Math.random()*3+1);
                    total += num[j];
                    if(max < num[j]){
                        max = num[j];
                    }
                    System.out.print("\t"+num[j]);
                }
                if(total/(max*3) == 1 && total%(max*3) == 0){
                    flag = false;
                    System.out.println("\t" + person[i].getName()+"님이 이겼습니다!");
                    break;
                }
                else{
                    System.out.println("\t\t 아쉽군요!");
                }
                total = 0;
                max = 0;
                System.out.println();
            }
        }
        scanner.close();
    }
}
