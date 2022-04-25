package domain;

import java.util.List;

public class Book {
	
	private String isbn;
	private String name;
	private Publisher publisher;
	private List<Chapter> chapter;
	
	public Book(String isbn, String name, Publisher publisher, List<Chapter> chapter) {
		
		this.isbn = isbn;
		this.name = name;
		this.publisher = publisher;
		this.chapter = chapter;
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Publisher getPublisher() {
		return publisher;
	}
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	public List<Chapter> getChapter() {
		return chapter;
	}
	public void setChapter(List<Chapter> chapter) {
		this.chapter = chapter;
	}
	
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", name=" + name + ", publisher=" + publisher + ", chapter=" + chapter + "]";
	}
	

}
