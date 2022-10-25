package leetcode.easy;

public class SqrtX {
	
	public int sqrt(int x) {
		// leetCode Easy 69
		
		//(int)Math.sqrt(x)
		// n*n <= x < (n+1)*(n+1) -> n
		if(x < 2) return x;
		
		long low = 1;
		long high = x;
		
		while(low < high) {
			long middle = 0;
			middle = low + (high - low) /2;
			
			if(middle * middle > x) {
				high = middle;
			} else {
				low = middle +1;
			}
		}
		
		int result = (int)low -1;
		
		// Runtime : 1ms, faster than 100.00% of Java online submissions for Sqrt(x)
		// Memory Usage : 35.9mb, less than 100.00% of Java online submissions for Sqrt(x)
		
		return result;
	}

}
