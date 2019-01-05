package exercise1230_4;

import java.util.Comparator;

public class DescBoardNo implements Comparator<Board> {

	@Override
	public int compare(Board o1, Board o2) {
		return Integer.compare(o2.getBoardNo(), o1.getBoardNo());
	}

}
