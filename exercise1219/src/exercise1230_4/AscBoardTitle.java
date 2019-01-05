package exercise1230_4;

import java.util.Comparator;

public class AscBoardTitle implements Comparator<Board> {

	@Override
	public int compare(Board o1, Board o2) {
		
		return o1.getBoardTitle().compareTo(o2.getBoardTitle());
	}

}
