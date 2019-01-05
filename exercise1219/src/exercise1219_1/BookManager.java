package exercise1219_1;

import java.util.*;
import java.io.*;

public class BookManager {
	private ArrayList<Book> booklist;
	
	public BookManager() {
		booklist = new ArrayList<Book> ();
	}
	
	public BookManager(ArrayList<Book> booklist) {
		this.booklist = booklist;
	}
	
	public void addBook(Book book) {
		booklist.add(book);
	}
	
	public void deleteBook(int index) {
		booklist.remove(index);
		System.out.println(index + "번 도서가 삭제되었습니다.");
	}
	
	public int searchBook(String bTitle) {
		int re = -1;
		
		int index = 0;
		while(index < booklist.size()) {
			if(booklist.get(index).getTitle().equals(bTitle)) {
				re = index;
				break;
			}
			index ++;	
		}	
		
		return re;
	}
	
	public void printBook(int index) {
		System.out.println(booklist.get(index));
	}
	
	public void displayAll() {
		int i = 0;
		while(i < booklist.size()) {
			System.out.println(booklist.get(i));
			
			i ++;
		}
	}
	
	public Book[] sortedBookList() {
		booklist.sort(new AscCategory());
		
		Book []book = new Book[booklist.size()];
		booklist.toArray(book);
		
		return book;			
	}
	
	public void printBookList(Book[] br) {
		for(Book b : br) {
			System.out.println(b);
		}
	}

}
