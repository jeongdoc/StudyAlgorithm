package leetcode.easy;

public class CountAndSay {
	
	public String countAndSay(int n) {
		String input = "1";
		
		// 312211
		return say(input, n);
	}
	
	private String say(String input, int n) {
		String result = input;
		if(n == 1) return "1";
		
		char[] car = result.toCharArray();
		char first = car[0];
		int count = 1;
		
		for(int i = 1; i < n; i ++) {
			
			for(int j = 1; j < result.length(); j ++) {
				if(first == car[j]) {
					count ++;
				} else {
					System.out.println(count + ", " + result);
					result += count;
					result += car[j];
					
					//first = car[j];
					count = 1;
				}
			}
			System.out.println(i);
		}
		result += count;
		System.out.println("result => " + result);
		
		return result;
	}
	
	
	
	

}
