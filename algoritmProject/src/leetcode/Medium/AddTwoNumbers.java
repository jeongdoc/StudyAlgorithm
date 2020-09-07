package leetcode.Medium;

public class AddTwoNumbers {
	
	int val;
	AddTwoNumbers next;
	AddTwoNumbers() {}
	AddTwoNumbers(int val) {this.val = val;}
	AddTwoNumbers(int val, AddTwoNumbers next) {this.val = val; this.next = next;}

	public static void main(String[] args) {
		// LeetCode Medieum 2
		AddTwoNumbers l1 = null;
		AddTwoNumbers list1 = new AddTwoNumbers(9);
		l1 = list1;
		
		AddTwoNumbers l2 = null;
		AddTwoNumbers list2 = new AddTwoNumbers(1);
		l2 = list2;
		list2.next = new AddTwoNumbers(9);
		list2 = list2.next;
		list2.next = new AddTwoNumbers(9);
		list2 = list2.next;
		list2.next = new AddTwoNumbers(9);
		
		
		AddTwoNumbers result = addTwoNumbers(l1, l2);
		
		while(result != null) {
			System.out.println(result.val);
			result = result.next;
		}
		
		// Runtime : 1ms, faster than 100.00% of Java online submissions for Add Two Numbers.
		// Memory Usage : 39.4ma, less than 85.27% of Java online submissions for Add Two Numbers.

	}
	
	public static AddTwoNumbers addTwoNumbers(AddTwoNumbers l1, AddTwoNumbers l2) {
		
		// 1 10 100 1000 10000
		AddTwoNumbers answerNode = new AddTwoNumbers(0);
		AddTwoNumbers temp = answerNode;
		
		int nodeVal = 0;
		int sum = 0;
		
		while(l1 != null || l2 != null) {
			if(l1 != null) {
				sum += l1.val;
				l1 = l1.next;
			}
			if(l2 != null) {
				sum += l2.val;
				l2 = l2.next;
			}
			
			nodeVal = sum %10;
			
			temp.next = new AddTwoNumbers(nodeVal);
			temp = temp.next;
			
			sum /= 10;
			
		}
		if(sum != 0) temp.next = new AddTwoNumbers(sum);
		
		return answerNode.next;
	}

}
