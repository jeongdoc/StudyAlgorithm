// 104. Maximum Depth of Binary Tree
// Easy
/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number}
 */

// 1
var maxDepth = function(root) {
    if(!root) {
        return 0;
    }
    
    let left = maxDepth(root.left);
    let right = maxDepth(root.right); 
    
    return left > right ? left+1 : right+1;
};

// 2
var maxDepth = function(root) {
    const helper = function(nodes) {
        
        if(!nodes) {
            return 0;
        }
        
        let left = helper(nodes.left);
        let right = helper(nodes.right);
        
        return Math.max(left, right) + 1;
        
    }
    
    return helper(root);
};