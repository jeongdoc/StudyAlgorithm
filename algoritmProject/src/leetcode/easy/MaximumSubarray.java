package leetcode.easy;

public class MaximumSubarray {
	
	public int maxSubarray(int[] nums) {
		int[] mainArr = nums;
		
		if(mainArr.length < 2) return mainArr[0];
		
		int max = mainArr[0];
		int curr = mainArr[0];
		for(int i = 1; i < mainArr.length; i ++) {
			
			curr = curr > 0 ? mainArr[i] + curr : mainArr[i];
			max = Math.max(max, curr);
			
		}
		
		// Runtime : 0ms, faster than 100.00% of Java online submissions for Maximum Subarray.
		// Memory Usage : 39.2mb, less than 87.08% of Java online submissions for Maximum Subarray.
		
		return max;
	}

}
