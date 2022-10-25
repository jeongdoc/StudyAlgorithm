package leetcode.easy;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// LeetCode Easy 14

		String[] s = {"apple", "application", "aplogise" , "api"};
		
		int len = s.length;
		
		String result = longestCommonPrefix(s, len);
		System.out.println(result);
		
		// Runtime : 0ms, faster then 100.00% of Java online submissions for Longest Common Prefix.
		// Memory Usage : 37.6mb, less than 72.84% of Java online submissions for Longest Common Prefix.
	}
	
	public static String longestCommonPrefix(String[] s, int len) {
		String prefix = null;
		
		if(len == 0) {
			prefix = "";
		} else {
			prefix = s[0];
			for(int i = 0; i < len; i ++) {
				while(s[i].indexOf(prefix) != 0) {
					prefix = prefix.substring(0, prefix.length() -1);
					
					if(prefix.length() < 1) prefix = "";
				}
			}
		}
		
		return prefix;
	}

}
