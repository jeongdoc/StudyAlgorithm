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
//		list1.next = new AddTwoNumbers(4);
//		list1 = list1.next;
//		list1.next = new AddTwoNumbers(3);
		
		AddTwoNumbers l2 = null;
		AddTwoNumbers list2 = new AddTwoNumbers(1);
		l2 = list2;
		list2.next = new AddTwoNumbers(9);
		list2 = list2.next;
		list2.next = new AddTwoNumbers(9);
		list2 = list2.next;
		list2.next = new AddTwoNumbers(9);
		list2 = list2.next;
		list2.next = new AddTwoNumbers(9);
		list2 = list2.next;
		list2.next = new AddTwoNumbers(9);
		list2 = list2.next;
		list2.next = new AddTwoNumbers(9);
		list2 = list2.next;
		list2.next = new AddTwoNumbers(9);
		list2 = list2.next;
		list2.next = new AddTwoNumbers(9);
		list2 = list2.next;
		list2.next = new AddTwoNumbers(9);
		
		AddTwoNumbers result = addTwoNumbers(l1, l2);
		
		while(result != null) {
			//System.out.println("result => " + result.val);
			result = result.next;
		}

	}
	
	public static AddTwoNumbers addTwoNumbers(AddTwoNumbers l1, AddTwoNumbers l2) {
		
		// 1 10 100 1000 10000
		int revNumList1 = 0;
		int revNumList2 = 0;
		int times = 1;
		int newNum = 0;
		
		if(l1.val == 0) return l2;
		if(l2.val == 0) return l1;
		
		while(l1 != null && l2 != null) {
			
			revNumList1 += (l1.val * times);
			revNumList2 += (l2.val * times);
			System.out.println(revNumList2);
			times *= 10;
			
			l1 = l1.next;
			l2 = l2.next;
			
			if(l1 == null) l1 = new AddTwoNumbers(0);
			else if(l2 == null) l2 = new AddTwoNumbers(0);
			
		}
		newNum = revNumList1 + revNumList2;
		
		//System.out.println("newNum => " + newNum);
		int nodeVal = 0;
		
		AddTwoNumbers answerNode = new AddTwoNumbers(0);
		AddTwoNumbers temp = answerNode;
		
		while(newNum != 0) {
			nodeVal = newNum %10;
			//System.out.println("nodeVal => " + nodeVal);
			temp.next = new AddTwoNumbers(nodeVal);
			temp = temp.next;
			
			newNum /= 10;
		}
		return answerNode.next;
	}

}
