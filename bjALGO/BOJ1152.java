package bojEX;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ1152 {

	public static void main(String[] args) {
		// boj1152
		String sentence = new Scanner(System.in).nextLine().trim();
		StringTokenizer st = new StringTokenizer(sentence, " ");
		System.out.println(st.countTokens());

	}

}
