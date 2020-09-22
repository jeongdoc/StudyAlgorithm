package leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import leetcode.easy.PlusOne;

class LeetCodeEasy {

	@Test
	void test() {
		PlusOne p = new PlusOne();
		int[] digits = {9, 8, 7, 6, 5, 4, 4, 3, 2, 1, 0};
		
		p.plusOne(digits);
	}

}
