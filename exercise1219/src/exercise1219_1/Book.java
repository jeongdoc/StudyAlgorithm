package exercise1219_1;

import java.io.*;

public class Book implements Serializable{
	private static final long serialVersionUID = -8038870189262770414L;
	
	private String bNo;
	private int categoty;
	private String title;
	private String author;
	
	public Book () {}
	
	public Book(String bNo, int categoty, String title, String author) {
		super();
		this.bNo = bNo;
		this.categoty = categoty;
		this.title = title;
		this.author = author;
	}

	public String getbNo() {
		return bNo;
	}

	public void setbNo(String bNo) {
		this.bNo = bNo;
	}

	public int getCategoty() {
		return categoty;
	}

	public void setCategoty(int categoty) {
		this.categoty = categoty;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String toString() {
		return bNo + ", " + categoty + ", " + title + ", " + author;
	}
	

}
