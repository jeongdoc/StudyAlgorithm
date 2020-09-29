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
		
		System.out.println(p.left.val);
		System.out.println(p.right.val);
		
		return false;
	}
}
