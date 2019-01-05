package exercise1219_1;

import java.util.*;

public class Lotto {
	public static void lotto() {
		TreeSet tS = new TreeSet();
		int x = 0;
		
		while(x < 7) {
			int y = (int)((Math.random() * 45) + 1);
			tS.add(y);
			
			x ++;
		}
		
		Object []iar = tS.toArray();
		int []i = new int[iar.length];
		
		for(int y = 0; y < i.length; y ++) {
			i[y] = (Integer)iar[y];
			System.out.print(i[y] + " ");
		}
	}

	public static void main(String[] args) {
		lotto();

	}

}
