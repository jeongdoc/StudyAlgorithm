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
		while(i != car[i]) {
			//System.out.println(car[i]);
			car[i] = car[car[i]];
			i = car[i];
			//i = car[i];
			//System.out.println("i => " + i);
			//System.out.println(i);
			//count ++;
			//System.out.println(count);
		}
		//System.out.println(i);
		
		return i;
	}
	
	public boolean isTree(int x, int y) {
		return find(x) == find(y);
	}
	
	public void connecting(int x, int y) {
		//System.out.println(x + ", " + y);
		int i = find(x);
		int j = find(y);
		car[i] = j;
		//System.out.println(j);
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
		
		for(int i = 0; i < len -1; i ++) {
			//System.out.println(arr[i]);
			connecting(arr[i], arr[i+1]);
			int temp = find(arr[i]);
			int temp2 = find(arr[i+1]);
			//System.out.println(car[temp]);
			
			//System.out.println(isTree(find(arr[i]), find(arr[i +1])));
			//System.out.println(temp + ", " + car[temp]);
			
			//System.out.println(isTree(i, i+1));
			
			System.out.println(temp + ", " + temp2);
		}
	//	System.out.println(result);
		
		return result;
	}

}
