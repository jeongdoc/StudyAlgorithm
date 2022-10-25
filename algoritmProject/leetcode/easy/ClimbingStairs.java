package leetcode.easy;

public class ClimbingStairs {
	
	public int climbStairs(int n) {
		// leetCode Easy 70
		if(n < 3) {
			return n;
		}
		
		int[] fibo = new int[n];
		fibo[0] = 1;
		fibo[1] = 2;
		
		for(int i = 2; i < n; i ++) {
			
			fibo[i] = fibo[i -1] + fibo[i -2];
			
		}
		
		// runtime : 0ms, faster than 100.00% of Java online submissions for Climbing Stairs.
		
		return fibo[n -1];
	}

}
