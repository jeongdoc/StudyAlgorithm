package programmers.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;import java.util.stream.Collectors;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] orders = {"XYZ", "XWY", "WXA"};
		
		int[] course = {2,3,4};
		int x = 0;
		int y = 0;
		String[] a = seq(orders, course, x, y);
		for(int i = 0; i < a.length; i ++) {
			//System.out.println(a[i]);
		}

	}
	
	public static void subsets(Character[] o, int x, int y, String[] orders) {
		int len = o.length;
		
		//String[] str = null;
		String result = "";
		int idx = 0;
		for(int i = 0; i < (1 << len); i ++) {
			//System.out.println(o[i]);
			String[] str = new String[len];
			int count = 0;
			String ss = "";
			for(int j = 0; j < len; j ++) {
				
				if((i & (1 << j)) > 0) {
					//ystem.out.print(o[j] + " ");
					ss += o[j].toString();
					str[count ++] = o[j].toString();
					System.out.println("========" + idx + ", " + len);
					
					
				}
				
			}
			str = Arrays.copyOf(str, count);
			
			
			result = Arrays.toString(Arrays.copyOf(str, count));
		}
	}
	
	public static String[] seq(String[] orders, int[] course, int x, int y) {
		
		String str = "";
		String[] answer = {};
		
		String[] ord = orders;
		int[] cor = course;
		
		for(int i = 0; i < ord.length; i ++) {
			str += ord[i];
		}
		
		List<Character> charList = str.chars().mapToObj(ele -> (char)ele).collect(Collectors.toList());
		Set<Character> set = new HashSet<>();
		Set<Character> sett = new HashSet<>();
		
		for(Character c : charList) {
			if(!set.add(c)) {
				sett.add(c);
			}
		}
		
		Character[] setar = set.toArray(new Character[set.size()]);
		
		// subset
		subsets(setar, x, y, ord);
		
//		for(int i = 0; i < arr1.length; i ++) {
//			//System.out.println(arr1.length);
//			for(int j = 0; j < ord.length; j ++) {
//				
//				if(ord[j].contains(arr1[i])) {
//					
//				}
//			}
//		}
		
//		for(int i = 0; i < ord.length; i ++) {
//			System.out.println(arr1[i]);
//			for(int j = 0; j < arr1.length; j ++) {
//				//System.out.println(arr1[j]);
//				if(ord[i].contains(arr1[j])) {
//					//System.out.println(ord[i]);
//				}
//			}
//		}
		
		//System.out.println(sett);
		
		
		List temp = Arrays.asList(orders);
		if(temp.contains(ord[x])) {
			
		}
		
		
		//System.out.println(Arrays.stream(ord).skip(1).toArray(String[]::new));
		//Arrays.stream(ord).skip(1).toArray(String[]::new);
		// length check
		
		
		
		// ascending 
		
		return Arrays.stream(ord).skip(1).toArray(String[]::new);
	}
	

}
