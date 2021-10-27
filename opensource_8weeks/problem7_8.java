package problem_8weeks;

import java.util.*;

public class problem7_8 {
	private HashMap<String, Integer> map = new HashMap<String, Integer>();
	private Scanner scanner = new Scanner(System.in);
	
	public problem7_8() { }
	
	public void run() {
		System.out.println("** ����Ʈ ���� ���α׷��Դϴ� **");

		while(true) {
			System.out.print("�̸��� ����Ʈ �Է�>> ");
			String name = scanner.next();
			if(name.equals("�׸�"))
				break;
			int point = scanner.nextInt();
			
			Integer n = map.get(name); 
			if(n != null) { 
				point += n; 
			}
			
			map.put(name, point); 
			printAll();
		}
	}
	
	void printAll() {
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String name = it.next();
			int point = map.get(name);
			System.out.print("("+name+","+point+")");			
		}
		System.out.println();
	}
	public static void main(String[] args) {
		problem7_8 man = new problem7_8();
		man.run();
	}
}

