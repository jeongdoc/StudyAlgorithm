package programmers.practice;

import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("solution1 => " + solution1("123_.def"));
		//System.out.println("solution1 => " + solution1("...!@BaT#*..y.abcdfghijklm"));
		System.out.println("solution1 => " + solution1("...1.."));

	}
	
	public static String solution1(String new_id) {
		// 아이디 미입력
		
		// level 1
		String id = new_id;
		
		//char[] chr = id.toCharArray();
		List<Character> charList = id.chars().mapToObj(ele -> (char)ele).collect(Collectors.toList());
		for(int i = 0; i < charList.size(); i ++) {
			if(!Character.isAlphabetic(charList.get(i)) && !Character.isDigit(charList.get(i))) {
				// level 3
				if(!seq(charList.get(i))) {
					charList.remove(charList.get(i));
					i -= 1;
				}
				//System.out.println(charList.toString());
			} else {
				// level 2
				if(Character.isUpperCase(charList.get(i))) {
					charList.set(i, (char) (charList.get(i) + 32));
				}
			}
			
			
				
		}
		// level 3
		for(int i = 0; i < charList.size(); i ++) {
			if(charList.get(i) == '.') {
				if(i+1 < charList.size()) {
					
					if(charList.get(i) == charList.get(i +1)) {
						charList.remove(i);
						i -= 1;
					}
				}
			}
		}
		
		// level 4
		
		if(charList.get(charList.size()-1) == '.') {
			charList.remove(charList.size()-1);
		}
		
		if(charList.size() > 0) {
			if(charList.get(0) == '.') {
				charList.remove(0);
			}
		}
		
		
		String result = "";
		for(int i = 0; i < charList.size(); i ++) {
			result += charList.get(i);
		}
		
		if(result.length() < 1) {
			result = "aaa";
		}
		System.out.println(result);
		if(result.length() > 15) {
			result = result.substring(0, 15);
			System.out.println(result);
			if(result.charAt(result.length()-1) == '.') {
				result = result.substring(0, result.length()-1);
			}
			
		}
		
		System.out.println("last -> " + result);
		if(result.length() > 0 && result.length() < 3) {
			while(result.length() < 3) {
				result += result.charAt(result.length()-1);
			}
			
		}
		
		return result;
	}
	
	public static boolean seq(char id) {
		boolean flag = false;
		
		switch(id) {
			case '-' : flag = true; break;
			case '_' : flag = true; break;
			case '.' : flag = true; break;
			default : flag = false;
		}
		//System.out.println(flag);
		return flag;
	}

}
