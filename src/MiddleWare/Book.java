package MiddleWare;

public class Book {

	private int id;
	public String title;
	private String author;
	private double price;
	private int nOfPages;
	public Book() {}
	public Book(int id, String title, String author, double price, int nOfPages) {
		//super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
		this.nOfPages = nOfPages;
	}
	
	
}
