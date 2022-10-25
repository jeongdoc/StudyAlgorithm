package leetcode.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		// LeetCode Easy 1
		
		int[] nums = {2, 11, 7, 15};
		int target = 9;
		
		Map<Integer, Integer> map = new HashMap<>();
		int[] temp = new int[] {0, 0};
		for(int i = 0; i < nums.length; i ++) {
			map.put(nums[i], i);
		}
		
		for(int i = 0; i < nums.length; i ++) {
			int result = target - nums[i];
			
			if(map.containsKey(result)) {
				
				int answer = map.get(result);
				if(answer == i) continue;
				
				temp[0] = i;
				temp[1] = answer;
				System.out.println(temp[0] + ", " + temp[1]);
				break;
			}
		}
		
		// Runtime : 2ms, faster than 79,20% of Java online submissions for Two Sum.
		// Memory Usage: 39.9mb, less than 48.58% of Java online submissions for Two Sum.
		
	}

}
