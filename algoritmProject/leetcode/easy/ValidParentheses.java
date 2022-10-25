package leetcode.easy;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		// LeetCode Easy 20

		String s ="())";
		int len = s.length();
		boolean flag = isValidParentheses(s, len);
		System.out.println(flag);
		
		// Runtime : 1ms, faster than 99.06% of Java online submissions for Valid Parentheses.
		// Memory Usage : 37.8mb, less than 49.07% of Java online submissions for Valid Parentheses. 
	}
	
	public static boolean isValidParentheses(String s, int len) {
		boolean flag = false;
		System.out.println("string => " + s);
		if(len % 2 == 0) {
			Stack<Character> stack  = new Stack<>();
			for(int i = 0; i < len; i ++) {
				char c = s.charAt(i);
				if(isLeft(c) > 0) {
					stack.push(c);
				} else {
					if(!stack.empty()) {
						char pop = stack.pop();
						
						if(isLeft(pop) != isRight(c)) {
							return false;
						}
						
					} else {
						return false;
					}
				}
				
			}
			flag = stack.isEmpty();
			
		}
		
		return flag;
	}
	
	public static int isLeft(char c) {
		int isValid = 0;
		
		switch(c) {
			case '(' : isValid = 1; break;
			case '{' : isValid = 2; break;
			case '[' : isValid = 3;	break;
		}
		return isValid;
	}
	
	public static int isRight(char c) {
		int isValid = 0;
		
		switch(c) {
		case ')' : isValid = 1; break;
		case '}' : isValid = 2; break;
		case ']' : isValid = 3;	break;
	}
		
		return isValid;
	}

}
