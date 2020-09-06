package leetcode.easy;

public class MergeTwoSortedLists {
	
	int val;
	MergeTwoSortedLists next;
	MergeTwoSortedLists() {}
	MergeTwoSortedLists(int val) { this.val = val; }
	MergeTwoSortedLists(int val, MergeTwoSortedLists next) { this.val = val; this.next = next; }

	public static void main(String[] args) {
		// LeetCode Easy 21
		MergeTwoSortedLists l1 = null;
		MergeTwoSortedLists list1 = new MergeTwoSortedLists(1);		
		l1 = list1;
		list1.next = new MergeTwoSortedLists(3);
		list1 = list1.next;
		list1.next = new MergeTwoSortedLists(4);
		
		
		MergeTwoSortedLists l2 = null;
		MergeTwoSortedLists list2 = new MergeTwoSortedLists(2);;
		l2 = list2;
		list2.next = new MergeTwoSortedLists(6);
		list2 = list2.next;
		list2.next = new MergeTwoSortedLists(7);
		
		System.out.println(listNode(l1, l2));
		
		// Runtime : 0ms, faster than 100.00% of Java online submissions for Merge Two Sorted Lists.
		// Memory Usage : 38.9mb, less than 86.40% of Java online submissions for Merge Two Sorted Lists.
	}
	
	public static MergeTwoSortedLists listNode(MergeTwoSortedLists l1, MergeTwoSortedLists l2) {
		//System.out.println(l1.val);
		MergeTwoSortedLists result = new MergeTwoSortedLists(0);
		MergeTwoSortedLists temp = result;
		
		
		while(l1 != null && l2 != null) {
			if(l1.val < l2.val) {
				temp.next = l1;
				l1 = l1.next;
			} else {
				temp.next = l2;
				l2 = l2.next;
			}
			
			temp = temp.next;
		}
		
		temp.next = l1 != null ? l1 : l2;
		
		return result.next;
	}

}
