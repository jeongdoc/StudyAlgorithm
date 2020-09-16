package leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import leetcode.easy.LengthOfLastWord;

class LeetCodeEasy {

	@Test
	void test() {
		LengthOfLastWord l = new LengthOfLastWord();
		String s = "hello world";
		l.wordLength(s);
	}

}
