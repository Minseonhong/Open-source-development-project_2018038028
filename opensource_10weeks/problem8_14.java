package problem_10weeks;

import java.io.File;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class problem8_14 {
	private File currentDir = null;
	private File subFiles[] = null;

	public problem8_14(String dirName) {
		currentDir = new File(dirName);
	}

	private void showSubDirtories() {
		System.out.println("\t[" + currentDir.getPath() + "]");
		subFiles = currentDir.listFiles();
		for (File f : subFiles) {
			System.out.print(((f.isFile()) ? "file" : "dir"));
			System.out.printf("%-15s", "\t\t" + f.length() + "����Ʈ");
			System.out.println("\t\t" + f.getName());
		}
	}

	private void mkdir(String dirName) {
		File newDir = new File(currentDir, dirName); 
		if (newDir.exists()) 
			System.out.println("�̹� �����ϴ� �����̳� ���͸� �̸��Դϴ�.");
		else {
			System.out.println(dirName + " ���͸��� �����Ͽ����ϴ�.");
			newDir.mkdir(); 
			showSubDirtories();
		}
	}

	private void rename(String src, String dest) {
		File srcFile = new File(currentDir, src); 
		File destFile = new File(currentDir, dest); 
		if (destFile.exists()) 
			System.out.println("�̹� �����ϴ� �����̳� ���͸� �̸��Դϴ�. �̸� �ٲ� �� �����ϴ�.");
		else {
			System.out.println(src + "�� " + dest + " �̸� �����Ͽ����ϴ�.");
			srcFile.renameTo(destFile); 
			showSubDirtories();
		}
	}

	private boolean contains(String filename) {
		for (File f : subFiles) {
			if (f.getName().equalsIgnoreCase(filename))
				return true;
		}
		return false;
	}

	public void run() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("***** ���� Ž�����Դϴ�. *****");
		showSubDirtories();

		while (true) {
			System.out.print(">>");
			String line = scanner.nextLine().trim(); 
			StringTokenizer st = new StringTokenizer(line, " "); 
			String command = st.nextToken(); 
			if (command.equals("�׸�"))
				break; 
			if (command.equals("..")) {
				String s = currentDir.getParent();
				if (s == null) 
					continue;
				else {
					currentDir = new File(currentDir.getParent());
					showSubDirtories();
				}

			}
			if (command.equalsIgnoreCase("mkdir")) {
				try {
					String dirName = st.nextToken(); 
					mkdir(dirName);
				} catch (NoSuchElementException e) {
					System.out.println("������ ���͸����� �־����� �ʾҽ��ϴ�!");
				}
			} else if (command.equalsIgnoreCase("rename")) {
				try {
					String src = st.nextToken(); 
					String dest = st.nextToken(); 
					rename(src, dest);
				} catch (NoSuchElementException e) {
					System.out.println("�� ���� ���ϸ��� �־����� �ʾҽ��ϴ�.!");
				}
			} else { 
				if (contains(command)) { 
					if (new File(currentDir, command).isDirectory()) { 
						currentDir = new File(currentDir, command);
						showSubDirtories();
					} else { 
						System.out.println("\t���͸��� �ƴմϴ�.!");
					}
				}
			}
		}

		scanner.close();
	}

	public static void main(String[] args) {
		problem8_14 fe = new problem8_14("c:\\");
		fe.run();
	}
}
