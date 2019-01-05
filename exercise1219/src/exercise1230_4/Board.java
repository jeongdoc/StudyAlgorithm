package exercise1230_4;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class Board implements Serializable{
	private static final long serialVersionUID = 7184634892258303843L;
	private SimpleDateFormat f = new SimpleDateFormat("yyyy'.'MM'.'dd ");
	
	private int boardNo;
	private String boardTitle;
	private String boardWriter;
	private Date boardDate;
	private String boardContent;
	private int readCount;
	
	public Board() {}

	public Board(int boardNo, String boardTitle, String boardWriter, Date boardDate, String boardContent,
			int readCount) {
		super();
		this.boardNo = boardNo;
		this.boardTitle = boardTitle;
		this.boardWriter = boardWriter;
		this.boardDate = boardDate;
		this.boardContent = boardContent;
		this.readCount = readCount;
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public String getBoardWriter() {
		return boardWriter;
	}

	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}

	public Date getBoardDate() {
		return boardDate;
	}

	public void setBoardDate(Date boardDate) {
		this.boardDate = boardDate;
	}

	public String getBoardContent() {
		return boardContent;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}

	public int getReadCount() {
		return readCount;
	}

	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public String toString() {
		return  
				"\n글 제목 : " + this.boardTitle + "      … ID : " + this.boardWriter +
				"\n날짜 : " + f.format(boardDate) + "  … No." + this.boardNo +
				"\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" +
				this.boardContent + 
				"\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" +
				"\n조회수 : " + this.readCount;
				
	}

}
