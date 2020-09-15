package leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import leetcode.easy.CountAndSay;
import leetcode.easy.MaximumSubarray;

class LeetCodeEasy {

	@Test
	void test() {
		MaximumSubarray max = new MaximumSubarray();
		int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		max.maxSubarray(nums);
	}

}
