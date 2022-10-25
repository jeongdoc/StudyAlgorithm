package leetcode.easy;

public class CountAndSay {
	
	public String countAndSay(int n) {
		// LeetCode Easy 38
		
		// Runtime : 1ms, faster than 94.94% of Java Online submissions for Count and Say
		// Memory Usage : 36.7mb, less then 87.25% of Java Online submissions for Count and Say
		
		return readString(n);
	}
	
	private String readString(int n) {
		if(n == 1) return "1";
		
		String str = "12345";
		System.out.println(str.substring(0, 1));
		
		String me = countAndSay(n -1);
		StringBuilder builder = new StringBuilder();
		
		char[] chr = me.toCharArray();
		char val = chr[0];
		int count = 0;
		
		for(int i = 0; i < chr.length; i ++) {
			if(chr[i] == val) {
				count ++;
			} else {
				builder.append(count);
				builder.append(val);
				
				count = 1;
				val = chr[i];
			}
		}
		builder.append(count);
		builder.append(val);
		
		return builder.toString();
	}
	
	
	
	

}
