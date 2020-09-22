package leetcode.easy;

public class PlusOne {
	
	public int[] plusOne(int[] digits) {		
		
		int num = 0;
		int len = digits.length -1;
		for(int i = len; i > -1 ; i --) {
			num = (digits[i] + 1) % 10;
			digits[i] = num;
			
			if(num != 0) break;
		}
		
		if(num == 0) {
			int[] temp = new int[digits.length +1];
			temp[0] = 1;
			
			return temp;
		}
		
		// Runtime : 0 ms, faster than 100.00% of Java online submissions for Plus One.
		// Memory Usage : 37.5mb, less than 98.24% of Java online submissions for Plue One.
		
		return digits;
	}
}
