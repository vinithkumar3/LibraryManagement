package FrontClasses;

import java.util.ArrayList;
import java.util.Scanner;

import MiddleWare.Book;
import MiddleWare.LibraryHelper;

public class LibrarySystem {

	public static void main(String[] args) {
		ArrayList<Book> booklist = new ArrayList<Book>();

		while (true) {
			System.out.println("Library ManageMent System");
			System.out.println("1.Add");
			System.out.println("2.update");
			System.out.println("3.sort bye author");
			System.out.println("4.sort by title");
			System.out.println("5.view x number sorted by author");
			System.out.println("6.delete");
			System.out.println("7.logout");

			Scanner input = new Scanner(System.in);
			System.out.println("Enter action to do:");
			String i = input.nextLine();
			int k = Integer.parseInt(i);
			LibraryHelper helper = new LibraryHelper();
			switch (k) {
			case 1:
				helper.AddBook(booklist, input);
				break;

			case 2:
				break;

			case 3:
				helper.readBook(booklist);
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				System.exit(0);
				break;
			}

		}

	}
}
