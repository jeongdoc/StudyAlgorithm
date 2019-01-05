package exercise1230_4;

import java.util.Comparator;

public class DescBoardTitle implements Comparator<Board> {

	@Override
	public int compare(Board o1, Board o2) {
		
		return o2.getBoardTitle().compareTo(o1.getBoardTitle());
	}

}
