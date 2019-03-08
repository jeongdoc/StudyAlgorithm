package bojEX;

import java.util.Scanner;
import java.util.Arrays;

public class BOJ1546 {

	public static void main(String[] args) {
		// 1546
		Scanner sc = new Scanner(System.in);
		int []iar = new int[sc.nextInt()];
		double tot = 0.0;
		
		for(int i = 0; i < iar.length; i ++) {
			iar[i] = sc.nextInt();
		}
		Arrays.sort(iar);
		double ms = iar[iar.length -1];
		for(int j = 0; j < iar.length; j ++) {
			tot += iar[j]/ms*100;
		}
		System.out.printf("%.2f", tot/iar.length);
		sc.close();
	}

}
