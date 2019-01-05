package exercise1219_1;

import java.util.*;
import java.io.*;

public class TestBookManager {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		menu();

	}
	
	public static void menu() {
		BookManager b = new BookManager();
		int n = 0;
		
		do {
			System.out.println("*** 도서 관리 프로그램 ***");
			System.out.println("\n1. 새 도서 추가 "
							   + "\n2. 도서정보 정렬 후 출력"
							   + "\n3. 도서 삭제"
							   + "\n4. 도서 검색 출력"
							   + "\n5. 전체 출력"
							   + "\n6. 끝내기");
			System.out.print("\n메뉴번호 입력 : ");
			n = sc.nextInt();
			switch(n) {
			case 1 : b.addBook(inputBook());							break;
			case 2 : b.printBookList(b.sortedBookList());				break;
			case 3 : b.deleteBook(b.searchBook(inputBookTitle()));		break;
			case 4 : b.printBook(b.searchBook(inputBookTitle()));		break;
			case 5 : b.displayAll();									break;
			case 6 : System.out.println("종료");
					return;
				default : System.out.println("잘못된 메뉴번호 입력");
			}

		}while(true);
	}
	
	public static Book inputBook() {
		
		System.out.print("도서 번호 입력 : ");
		String bNum = sc.next();
		System.out.print("도서 분류 코드 : ");
		int cNum = sc.nextInt();
		System.out.print("도서명 입력 : "); 
		sc.nextLine();
		String title = sc.nextLine();
		System.out.print("저자 입력 : ");
		String name = sc.next();
		
		Book bb = new Book(bNum, cNum, title, name);
		
		return bb;
		
	}
	public static String inputBookTitle() {
		System.out.print("찾을 책이름 입력 : ");
		String name = sc.next();
		
		return name;
	} 

}
