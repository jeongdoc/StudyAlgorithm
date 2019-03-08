package bojEX;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ19817 {

	public static void main(String[] args) {
		// 10817
		Scanner sc = new Scanner(System.in);
		int []iar = new int[3];
		for(int i = 0; i < iar.length; i ++) {
			iar[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(iar);
		System.out.println(iar[1]);
	}

}
