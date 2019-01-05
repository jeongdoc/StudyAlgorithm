package exercise1219_1;

import java.util.*;

public class AscCategory implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		int	re = (o1.getCategoty() > o2.getCategoty() ? 1 : (o1.getCategoty() == o2.getCategoty()) ? 0 : -1);
		
		return re;
	}


}
