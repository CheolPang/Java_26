package com.usebook;

public class Book {
	public String title;
	public String publisher;
	public String writer;
	public int price;

	public Book() {
		System.out.println("기본 디폴트 생성자 함수");
	}

	private Book(String title) {
		this.title = title;

	}

	protected Book(String title, int price) {
		this.title = title;
		this.price = price;
	}

	Book(String title, int price, String writer, String publisher) {
		this.title = title;
		this.price = price;
		this.writer = writer;
		this.publisher = publisher;
	}

	public void printBook() {
		System.out.println("title: " + title + ", price: " + price + ", writer: " + writer + ", publisher: " + publisher);
		System.out.println("============");
	}
	public static void main(String[] args) {
		Book book1 = new Book("자바 프로그래밍");
		book1.printBook();
		Book book3 = new Book("자바 프로그래밍", 20000, "김작가", "정보고출판사");
		book3.printBook();
	}
}
