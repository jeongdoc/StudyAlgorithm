package leetcode.easy;

public class ImplementStrStr {
	
	public int str(String haystack, String needle) {
		// LeetCode Easy 28
		//int result = haystack.indexOf(needle);
		char[] hay = haystack.toCharArray();
		char[] ned = needle.toCharArray();
		
		int hayLen = hay.length;
		int nedLen = ned.length;
		
		if(nedLen < 1) return 0;
		if(hayLen < nedLen) return -1;
		
		int nedIdx = 0;
		
		for(int hayIdx = 0; hayIdx < hayLen;) {
			if(ned[nedIdx] == hay[hayIdx]) {
				nedIdx ++;
			} else {
				hayIdx = hayIdx - nedIdx;
				nedIdx = 0;
			}
			hayIdx ++;
			
			if(nedIdx == nedLen) return hayIdx - nedIdx;
		}
	
		return -1;
		
		// Runtime : 1ms, faster than 66.40% of Java Online submissions for Implement strStr()
		// Memory Usage : 37.9mb, less than 84.89% of Java Online submissions for Implement strStr()
		
		
		// 걍 indexOf 써서 풀었을 때 
		// haystack.indexOf(needle);
		// Runtime : 0ms, faster than 100.00% of Java online submissions for Implement strStr()
		// Memory Usage : 37.8mb, less than 93.54% of Java Online submissions for Implement strStr()
	}

}
