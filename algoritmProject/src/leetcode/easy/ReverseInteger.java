package leetcode.easy;

public class ReverseInteger {

	public static void main(String[] args) {
		// LeetCode Easy 7
		int input = 1534236469;
		long rev = 0;
		
		while(input != 0) {
			long temp =(rev * 10) + (input % 10);
			
			rev = (temp - (input % 10)) / 10 != rev ? 0 : temp;
			
			input /= 10;
		}
		
		System.out.println(rev);
		
		// Runtime : 1ms, faster then 100.00% of Java online submissions for Reverse Integer.
		// Memory Usage : 36.2mb, less then 99.47% of Java online submissions for Reverse Integer.
	}

}
