package leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import leetcode.easy.ImplementStrStr;
import leetcode.easy.RemoveElement;

class LeetCodeEasy {

	@Test
	void test() {
		ImplementStrStr str = new ImplementStrStr();
//		String haystack = "hello";
//		String needle = "ll";
		String haystack = "mississippi";
		String needle = "issip";
		str.str(haystack, needle);
	}

}
