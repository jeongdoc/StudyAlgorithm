package exercise1230_4;

import java.util.Comparator;

public class AscBoardNo implements Comparator<Board> {

	@Override
	public int compare(Board o1, Board o2) {
		return Integer.compare(o1.getBoardNo(), o2.getBoardNo());
	}

}
