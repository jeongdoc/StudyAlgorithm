package leetcode.easy;

public class SymmetricTree {
	
	public int val;
	public SymmetricTree left;
	public SymmetricTree right;
	public SymmetricTree() {}
	public SymmetricTree(int val) { this.val = val; }
	public SymmetricTree(int val, SymmetricTree left, SymmetricTree right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
	
	public boolean isSymmetric(SymmetricTree root) {
		// leetCode 101
		
		// Runtime : 0 ms, faster than 100.00% of Java online submissions for SymmetricTree.
		// Memory usage : 36.9mb, less than 14.82% of Java online submissions for Symmetric Tree.
		boolean flag = false;
		
		if(root == null) {
			flag = true;
		} else {
			flag = checkTree(root.left, root.right);
		}
		
		return flag;
	}
	
	boolean checkTree(SymmetricTree p, SymmetricTree q) {
		boolean flag = false;
		
		if(p == null && q == null) {
			flag = true;
		} else if(p == null || q == null) {
			flag = false;
		} else {
			flag = p.val == q.val && checkTree(p.left, q.right) && checkTree(p.right, q.left);
		}
		
		return flag;
	}

}
