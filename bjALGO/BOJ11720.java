package bojEX;

import java.util.Scanner;

public class BOJ11720 {

	public static void main(String[] args) {
		// Boj11720
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String snum = sc.next();
		sc.close();
		int sum = 0;
		for(int i = 0; i < x; i++) {
			sum += snum.charAt(i) - '0';
		}
		System.out.println(sum);
	}

}
