package leetcode.easy;

public class PlusOne {
	
	public int[] plusOne(int[] digits) {
		int[] result = {};
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < digits.length; i ++) {
			sb.append(digits[i]);
		}
		String num = sb.toString();
		int number= Integer.parseInt(num) + 1;
		System.out.println(number);
		
		int newNumber = 0;
		for(int i = 0; i < num.length(); i ++) {
			
			result[i] = 0; 
		}
		//System.out.println("re -> " + result[0]);
		
		return result;
	}
}
