package bojEX;

import java.util.Scanner;

public class BOJ1924 {

	public static void main(String[] args) {
		// boj1924
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		
		int []months = {31,28,31,30,31,30,31,31,30,31,30,31};
		String []days = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		
		int sumOfDate = y;
		for(int i = 0; i < m-1; ++i) {
			sumOfDate += months[i];
		}
		System.out.println(days[sumOfDate % 7]);
	}

}
