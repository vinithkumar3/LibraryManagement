package MiddleWare;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class LibraryHelper {
	
	public  void AddBook( ArrayList<Book> booklist, Scanner input) {
		System.out.println("Enter title:");
		String title = input.nextLine();
		System.out.println("Enter Author Name: ");
		String author = input.nextLine();
		System.out.println("Enter Book Pric:");
		double price = input.nextDouble();
		System.out.println("Enter pages:");
		int np=input.nextInt();
		System.out.println("Enter ID:");
		int id = input.nextInt();
		
		Book b = new Book(id, title, author, price, np);
		
		booklist.add(b);
		
	}
public void readBook(ArrayList<Book> booklist) {
	
	Iterator<Book> itr = booklist.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next().title);
	}
}
}
