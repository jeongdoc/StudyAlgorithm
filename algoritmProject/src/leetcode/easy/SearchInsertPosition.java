package leetcode.easy;

public class SearchInsertPosition {

	public int searchInsert(int[] nums, int target) {
		// LeetCode Easy 35
		int result = 0;
		
		if(nums.length < 1) return result;
		for(int i = 0; i < nums.length; i ++) {
			if(target == nums[i]) {
				result = i;
				break;
			} else {
				if(target < nums[i]) {
					result = i;
					break;
				} else {
					result = i +1;
				}
			}
		}
		
		return result;
		
		// Runtime : 0ms, faster than 100.00% of Java Online submissions for Search Insert Position
		// Memory Usage : 39.1mb, less than 74.98% of Java Online submissions for Search Insert Position
	}
}
