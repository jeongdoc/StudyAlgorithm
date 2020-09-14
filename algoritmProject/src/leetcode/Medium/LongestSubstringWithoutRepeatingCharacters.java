package leetcode.Medium;

import java.util.Deque;
import java.util.LinkedList;

public class LongestSubstringWithoutRepeatingCharacters {
	
	public int nonRepeatingString(String s) {
		s = "aabbaccc";
		// 2ab2cdabdb2cd
		int result = 0;
		
		int len = s.length();
		int temp = 0;
		int count = 1;
		int[] idx = new int[128];
		
		StringBuilder sb = new StringBuilder();
		for(int j = 0, i = 0; j < len; j ++) {
			
			i = Math.max(idx[s.charAt(j)], i);
			
			temp = Math.max(temp, j - i + 1);
			idx[s.charAt(j)] = j + 1;
			
			if(j== i) {
				sb.append(count);
				sb.append(s.charAt(i));
				System.out.println("if " + s.charAt(i));
				System.out.println("to string -> " + sb.toString());
				count = 1;
				//idx[s.charAt(temp)] = idx[s.charAt(i)];
			} else {
				count ++;
				System.out.println("else " + s.charAt(i));
			}
			//System.out.println("j => "  + j);
			//System.out.println("temp => " + temp);
			
		}
		//sb.append(count);
		//count += 1;
		return result;
	}

}
