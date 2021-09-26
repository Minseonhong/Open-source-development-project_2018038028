package pratice_4weeks;

import java.util.Scanner;

class books{
	String title, author;
	public books(String title, String author)
	{
		this.title = title;
		this.author = author;
	}
}

public class Book3 {
	public static void main(String[] args) {
		books [] book = new books[2];
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<book.length;i++)
		{
			System.out.print("제목>>");
			String title = sc.nextLine();
			System.out.print("저자>>");
			String author = sc.nextLine();
			book[i] = new books(title, author);
		}
		
		for(int i =0; i<book.length; i++)
		{
			System.out.print("(" + book[i].title + "," + book[i].author + ")");
		}
		
		sc.close();

	}

}
