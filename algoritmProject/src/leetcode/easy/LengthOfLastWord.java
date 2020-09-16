package leetcode.easy;

public class LengthOfLastWord {
	
	public int wordLength(String s) {
		int result = 0;
		
//		String[] str = s.split(" ");
//		int len = str.length;
//		
//		result = len > 0 ? str[len -1].length() : 0;
//		split은 1ms
		
		char[] car = s.toCharArray();
		int idx = car.length -1;
		while(idx > -1 && car[idx] == ' ') {
			idx --;
		}
		
		while(idx > -1 && car[idx] != ' ') {
			result ++;
			idx --;
		}
		// Runtime : 0ms, faster than 100.00% of Java online submissions for Length of Last Word.
		// Memory Usage : 37.2mb, less than 97.28% of Java online submissions for Length of Last Word.
		
		return result;
	}

}
