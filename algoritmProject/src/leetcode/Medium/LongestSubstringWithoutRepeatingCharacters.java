package leetcode.Medium;

import java.util.Deque;
import java.util.LinkedList;

public class LongestSubstringWithoutRepeatingCharacters {
	
	private int[] car;
	private char[] arr;
	
//	public LongestSubstringWithoutRepeatingCharacters(int i) {
//		car = new int[i];
//		for(int j = 0; j < i; j ++) {
//			car[j] = i;
//		}
//	}
	
	public int find(int i) {
		//System.out.println(i);
		int count = 0;
		//int sum = 0;
		while(i != car[i]) {
			car[i] = car[car[i]];
			//System.out.println("1 => " + car[i]);
			i = car[i];
			//i = car[i];
			//System.out.println("i => " + i);
			//System.out.println(car[i]);
			//count ++;
			//System.out.println(count);
		}
		
		
		return i;
	}
	
	public boolean isTree(int x, int y) {
		return find(x) == find(y);
	}
	
	public void connecting(int x, int y) {
		int i = find(x);
		int j = find(y);
		System.out.println(i + ", " + j);
		car[i] = j;
		//System.out.println(car[98]);
	}

	public int nonRepeatingString(String s) {
		// 확인 -> 중복인가? 연속되는가?
		int result = 0;
		int max = 0;
		arr = s.toCharArray();
		int len = arr.length;
		
		if(len < 2) return len;
		
		car = new int[128];
		for(int i = 0; i < car.length; i ++) {
			car[i] = i;
		}
		
		int min = 0;
		int temp = 0;
		int y = 0;
		for(int i = 0; i < len; i ++) {
			
			temp = arr[i];
			//System.out.println(temp);
			
			System.out.println(car[temp]);
			
			
			
			//int temp = arr[i];
			//System.out.println(temp);
		}
		//System.out.println(isTree(112, 107));
		//System.out.println(min);
		//System.out.println(max);
		
		return result;
	}

}
