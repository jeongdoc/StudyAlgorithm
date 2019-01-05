package exercise1230_4;

import java.util.Comparator;

public class AscBoardDate implements Comparator<Board> {

	@Override
	public int compare(Board o1, Board o2) {
		
		return o1.getBoardDate().compareTo(o2.getBoardDate());
	}

}
