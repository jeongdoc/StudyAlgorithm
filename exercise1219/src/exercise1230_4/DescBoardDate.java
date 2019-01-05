package exercise1230_4;

import java.util.Comparator;

public class DescBoardDate implements Comparator<Board> {

	@Override
	public int compare(Board o1, Board o2) {
		
		return o2.getBoardDate().compareTo(o1.getBoardDate());
	}

}
