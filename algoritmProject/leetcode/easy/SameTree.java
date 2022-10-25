package leetcode.easy;

public class SameTree {
	
	public int val;
	public SameTree left;
	public SameTree right;
	public SameTree() {}
	public SameTree(int val) { this.val = val; }
	public SameTree(int val, SameTree left, SameTree right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}

	public boolean isSameTree(SameTree p, SameTree q) {
		// leetCode Easy 100
		
		// recursion
		// Runtime : 0ms, faster than 100.00% of Java online submissions for Same Tree.
		boolean flag = false;
//		
//		if(p != null && q != null) {
//			flag = p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
//			
//			return flag;
//		} else if(p == null && q == null) {
//			flag = true;
//			
//			return flag;
//		} else {
//			return flag;
//		}
		
		// linear
		// Runtime : 0ms, faster than 100.00% of Java online submissions for Same Tree.
		if(p == null || q == null) {
			flag = p == q;
		} else {
			flag = p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
		}
		return flag;
		
	}
}
