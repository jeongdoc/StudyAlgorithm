package exercise1230_4_view;

import java.util.*;

import ecercise1230_4_cont.BoardManager;

import java.io.*;

public class BoardMenu {
	private Scanner sc = new Scanner(System.in);
	private BoardManager b = new BoardManager();
	
	public BoardMenu() {}
	
	public void mainMenu() {
		int menu = 0;
		
		do {
		System.out.println("******** 게시글 서비스 프로그램 ********");
		System.out.println("\n1. 게시글 쓰기" + "\n2. 게시글 전체 보기");
		System.out.println("3. 게시글 한 개 보기" + "\n4. 게시글 제목 수정");
		System.out.println("5. 게시글 내용 수정" + "\n6. 게시글 삭제");
		System.out.println("7. 게시글 검색" + "\n8. 파일에 저장하기");
		System.out.println("9. 정렬하기" + "\n10. 끝내기");
		
		System.out.print("\n메뉴 번호 선택 : ");
		menu = sc.nextInt();
		
		switch(menu) {
		case 1 : b.writeBoard(); 		break;
		case 2 : b.displayAllList(); 		break;
		case 3 : b.displayBoard(); 		break;
		case 4 : b.modifyTitle(); 		break;
		case 5 : b.modifyContent(); 		break;
		case 6 : b.deleteBoard(); 		break;
		case 7 : b.searchBoard(); 		break;
		case 8 : b.saveListFile(); 		break;
		case 9 : sortSubMenu(); 		break;
		case 10 : System.out.println("종료합니다.");
				return;
			default : System.out.println("잘못 입력하셨습니다. 메뉴 번호를 다시 선택해주세요.");
			}
		} while(true);
	}
	public void sortSubMenu() {
		int menu = 0;
		do {
			System.out.println("****** 게시글 정렬 메뉴 ******");
			System.out.println("1. 글번호순 오름차순 정렬");
			System.out.println("2. 글번호순 내림차순 정렬");
			System.out.println("3. 작성날짜순 오름차순정렬");
			System.out.println("4. 작성날짜순 내림차순 정렬");
			System.out.println("5. 글제목순 오름차순 정렬");
			System.out.println("6. 글제목순 내림차순 정렬");
			System.out.println("7. 이전 메뉴로 이동");
			System.out.print("\n메뉴 번호 선택 : ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1 : b.sortList(1, false);		break;
			case 2 : b.sortList(1, true);		break;
			case 3 : b.sortList(2, false);		break;
			case 4 : b.sortList(2, true);		break;
			case 5 : b.sortList(3, false);		break;
			case 6 : b.sortList(3, true);		break;
			case 7 : System.out.println("이전 메뉴로 돌아갑니다.");
					return;
				default : System.out.println("메뉴 번호를 다시 선택해주세요.");
			}
		} while(true);
	}

}
