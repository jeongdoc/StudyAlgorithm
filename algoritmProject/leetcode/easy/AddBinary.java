package leetcode.easy;

public class AddBinary {
	
	public String addBinary(String a, String b) {
		
		StringBuilder builder = new StringBuilder();
		
		int aa = a.length() -1;
		int bb = b.length() -1;
		
		int carry = 0;
		
		while(aa > -1 || bb > -1) {
			int sum = carry;
			
			if(aa > -1) {
				sum += a.charAt(aa) - '0';
			}
			if(bb > -1) {
				sum += b.charAt(bb) - '0';
			}
			
			builder.append(sum % 2);
			carry = sum / 2;
			
			aa --;
			bb --;
			
		}
		
		if(carry != 0) {
			builder.append(carry);
		}
		builder.reverse();
		
		return builder.toString();
	}

}
