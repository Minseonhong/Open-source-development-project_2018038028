package problem_10weeks;

import java.io.*;
import java.util.*;

public class problem8_12 {
	private File targetFile = null;
	Vector<String> lineVector = new Vector<String>();

	public problem8_12() { }

	private void readFile(String fileName) {
		targetFile = new File(fileName);
		try {
			Scanner fScanner = new Scanner(new FileReader(targetFile));
			while (fScanner.hasNext()) {
				String line = fScanner.nextLine(); 
				lineVector.add(line); 
			}
			fScanner.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private Vector<Integer> searchWord(String word) { 
		Vector<Integer> noVector = new Vector<Integer>();
		for (int i = 0; i < lineVector.size(); i++) {
			String line = lineVector.get(i);
			if (line.indexOf(word) != -1)
				noVector.add(i);
		}

		return noVector;
	}

	private void printLines(Vector<Integer> noVector) {
		for (int i = 0; i < noVector.size(); i++) {
			int lineNo = noVector.get(i);
			String line = lineVector.get(lineNo);
			System.out.println(lineNo + ":" + line);
		}
	}

	public void run() {
		System.out.println("��ü ��θ��� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�.");
		System.out.print("��� ���ϸ� �Է�>> ");
		Scanner scanner = new Scanner(System.in);
		String fileName = scanner.nextLine();

		readFile(fileName); 

		while (true) {
			System.out.print("�˻��� �ܾ ����>> ");
			String line = scanner.nextLine();
			if (line.equals("�׸�"))
				break; 
			Vector<Integer> noVector = searchWord(line); 
			printLines(noVector);
		}
		scanner.close();
		System.out.println("���α׷��� �����մϴ�.");
	}

	public static void main(String[] args) {
		problem8_12 ws = new problem8_12();
		ws.run();
	}
}
