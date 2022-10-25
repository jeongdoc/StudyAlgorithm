package leetcode.easy;

public class RemoveElement {

	public int removeElement(int[] nums, int val) {
		// LeetCode Easy 27
		int idx = 0;
		
		if(nums.length < 1) return idx;
		
		for(int i = 0; i < nums.length; i ++) {			
			int temp = nums[i];
			System.out.println(temp);
			if(temp != val) {
				nums[idx] = temp;
				idx ++;
			} else {
				continue;
			}
			
		}
		// Runtime : 0ms, faster than 100.00% of Java Online submissions for Remove Element
		// Memory Usage : 38.1mb, less than 63.38% of Java Online submissions for Remove Element
		return idx;
	}
}
