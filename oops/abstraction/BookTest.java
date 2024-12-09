package abstraction;

import java.util.Scanner;

public class BookTest {

	public static void main(String[] args) {
		Book b=new MyBook();
		System.out.print("Enter name of the book : ");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		b.setTitle(name);
		System.out.println("---------------------------------------");
		System.out.println(b.getTitle());
		System.out.println("---------------------------------------");
		sc.close();
	}

}
