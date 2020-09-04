package programmersEX;

import java.util.TreeMap;

public class mobileList {

	public static void main(String[] args) {
		//프로그래머스 - 전화번호 목록
		//String[] phoneBook = {"119", "97674223", "1195524421"};
		//String[] phoneBook = {"123","456","789"};
		String[] phoneBook = {"567","1235","88","123","12"};
		boolean flag = true;
		
		TreeMap<String, Integer> tm = new TreeMap<>();
		for(int i = 0; i < phoneBook.length; i ++) {
			tm.put(phoneBook[i], 0); 
		}
		for(int i = 0; i < phoneBook.length; i ++) {
			if(phoneBook[i].equals(tm.firstKey()))
				continue;
			if(phoneBook[i].startsWith(tm.firstKey())) {
				flag = false;
				break;
			}
		}
		System.out.println(flag);
	}
}
