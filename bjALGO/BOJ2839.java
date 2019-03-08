package bojEX;

import java.util.Scanner;

public class BOJ2839 {

	public static void main(String[] args) {
		// boj2839
		int num = new Scanner(System.in).nextInt();
		int fnum = 0;
		int tnum = 0;
		while(num%5 != 0 && num >= 0) {
			num -= 3;
			tnum ++;
		}
		if(num < 0)
			System.out.println(-1);
		else {
			fnum = num/5;
			System.out.println(fnum + tnum);
		}
	}

}
