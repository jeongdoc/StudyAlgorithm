package ecercise1230_4_cont;

import java.io.*;
import java.util.*;

import exercise1230_4.*;

public class BoardManager {
	private ArrayList<Board> list = new ArrayList<Board> ();
	private Scanner sc = new Scanner(System.in);
	
	public BoardManager() {
		String fn = "board_list.dat";
		try(ObjectInputStream save = new ObjectInputStream((new FileInputStream(fn))))
		{
			list = (ArrayList<Board>) save.readObject();
		} catch(Exception e) {
			System.out.println("프로그램을 시작합니다.");
		}
	}
	
	public void writeBoard() {
		System.out.println("새 게시글 쓰기입니다.");
		System.out.print("\n글제목 : ");
		String title = sc.nextLine();
		
		System.out.print("작성자 : ");
		String author = sc.next();
		
		Date d = new Date();
		
		System.out.println("글내용 입력 ─── ");
		String text = null;
		StringBuilder builder = new StringBuilder();
		while(!(text = sc.nextLine()).toLowerCase().equals("exit")) {
			builder.append(text + "\n");
		}
		Board board = new Board(list.size(), title, author, d, builder.toString(), 0);
		list.add(board);
	}
	
	public void displayAllList() {
		for(Board bl : list) {
			System.out.println(bl);
		}
	}
	
	public void displayBoard() {
		System.out.print("조회할 글 번호 : ");
		int bNo = sc.nextInt();

		int index = 0;
		while(index < list.size()) {
			if(list.get(index).getBoardNo() == bNo) {
				list.get(bNo).setReadCount(list.get(bNo).getReadCount() + 1);
				System.out.println(list.get(bNo));
				} 
			index ++;
		}
	}
	public void modifyTitle() {
		System.out.print("수정할 글 번호 : ");
		int bNo = sc.nextInt();

		int index = 0;
		while(index < list.size()) {
			if(list.get(index).getBoardNo() == bNo) {
				System.out.print("새 제목 입력 : ");
				sc.nextLine();
				String title = sc.nextLine();
				list.get(bNo).setBoardTitle(title);
				System.out.println(bNo + "번 게시글 제목이 변경되었습니다!");
			}
			index ++;
		}
	}
	public void modifyContent() {
		System.out.print("수정할 글 번호 : ");
		int bNo = sc.nextInt();
		
		StringBuilder builder = new StringBuilder();
		String change = null;
		int index = 0;
		while(index < list.size()) {
			if(list.get(index).getBoardNo() == bNo) {
				list.get(bNo);
				System.out.println("변경할 내용 ─── ");
				while(!(change = sc.nextLine()).equals("exit")) {
						builder.append(change + "\n");
					}
					list.get(bNo).setBoardContent(builder.toString());
					System.out.println("변경이 완료되었습니다!");
				}
			index ++;
		}
	}
	public void deleteBoard() {
		System.out.print("삭제할 글 번호 : ");
		int bNo = sc.nextInt();
		
		int index = 0;
		while(index < list.size()) {	
			if(list.get(index).getBoardNo() == bNo) {
				list.get(bNo);
				System.out.println("정말로 삭제하시겠습니까? (y/n)");
				if( (sc.next().toLowerCase().charAt(0) == 'y')) { 
							list.remove(list.get(index));
				}
				System.out.println(index + "번 글을 삭제하였습니다.");
			}			
			index ++;
		}
		
		System.out.println("메뉴로 돌아갑니다.");
	}
	public void searchBoard() {
		System.out.print("검색할 제목 : ");
    		String sTitle = sc.nextLine().toLowerCase().toUpperCase();
    	
    		int index = 0;
    		while(index < list.size()) {
    			if(list.get(index).getBoardTitle().contains(sTitle)) {
    				System.out.println("< 검색 결과 >");
    				System.out.println(list.get(index));
    			}
    			index ++;
    		}
	}
	public void saveListFile() {
		String fn = "board_list.dat";
    	try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fn));)
    	{  		
    		oos.writeObject(list);
    		System.out.println(fn + " 에 성공적으로 저장되었습니다!");
    		
    	} catch(IOException e) {
    		e.printStackTrace();
    	}
	}
	public void sortList(int item, boolean isDesc) {
		if(item == 1) {
			if(!isDesc) {
				list.sort(new AscBoardNo());
			} else {
				list.sort(new DescBoardNo());
			}
		}
		
		if(item == 2) {
			if(!isDesc) {
				list.sort(new AscBoardDate());
			} else {
				list.sort(new DescBoardDate());
			}
		}
		
		if(item == 3) {
			if(!isDesc) {
				list.sort(new AscBoardTitle());
			} else {
				list.sort(new DescBoardTitle());
			}
		}
		
		displayAllList();
	}
}
