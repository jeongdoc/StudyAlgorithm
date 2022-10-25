package leetcode.easy;

public class PalindromeNumber {

	public static void main(String[] args) {
		// LeetCode Easy 9
		
		int x = 315;
		
		boolean result = palindromeNumber(x);
		System.out.println(result);
		
		// Runtime : 6ms, faster than 100.00% of Java online submissions for Palindrome Number.
		// Memeory Usage : 38.5mb, less than 99.44% of Java online submissions for Palindrome Number;

	}
	
	public static boolean palindromeNumber(int x) {
		boolean flag = false;
		
		if(x < 0 || (x % 10 == 0 && x != 0)) {
			return flag;
		}
		
		int rev = 0;
		while(x > rev) {
			rev = (rev * 10) + (x % 10);
			x /= 10;
		}
		
		flag = (rev == x) || (rev/10 == x) ? true : false;
		
		return flag;
	}

}
