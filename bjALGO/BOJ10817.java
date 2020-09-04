package bojEX;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ10817 {

	public static void main(String[] args) {
		// boj10817
		Scanner s = new Scanner(System.in);
		int []iar = new int[3];
		for(int j = 0; j < iar.length; j ++) {
			iar[j] = s.nextInt();
		}
		s.close();
		Arrays.sort(iar);
		System.out.println(iar[1]);
	}

}
