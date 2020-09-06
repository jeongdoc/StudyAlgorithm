package leetcode.easy;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		// LeetCode Easy 26
		int[] nums = {0, 0, 1, 1, 3, 4, 6, 6};
		int result = removeDuplicates(nums);
		
		System.out.println(result);
		
		// Runtime : 0ms, faster than 100.00% of Java online submissions for Remove Duplicates from Sorted Array.
		// Memory Usage : 41mb, less than 92.97% of Java online submissions for Remove Duplicates from Sorted Array.
	}
	
	public static int removeDuplicates(int[] nums) {
		int result = 0;
		int len = nums.length;
		
		int cnt = 0;
		for(int i = 0; i < len -1; i ++) {
			
			if(nums[i] != nums[i +1]) {
				cnt += 1;
				nums[cnt] = nums[i +1];
			} 
		}
		result = cnt +1;
		return result;
	}

}
