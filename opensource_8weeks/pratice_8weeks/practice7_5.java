package pratice_8weeks;
import java.util.*;

public class practice7_5 {
	public static void main(String[] args) {
		HashMap<String, String> dic = new HashMap<String, String>();
		
		dic.put("baby", "�Ʊ�"); 
		dic.put("love", "���");
		dic.put("apple", "���");
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("ã�� ���� �ܾ��?");
			String eng = scanner.next();
			if(eng.equals("exit")) {
				System.out.println("�����մϴ�...");
				break;
		}
			String kor = dic.get(eng);
			if(kor == null)
				System.out.println(eng + "�� ���� �ܾ� �Դϴ�.");
			else
				System.out.println(kor);
		}
		scanner.close();
	}
}