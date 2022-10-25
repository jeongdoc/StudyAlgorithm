// 94. Binary Tree Inorder Traversal
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
 * @return {number[]}
 */
 var inorderTraversal = function(root) {
    
    let result = [];
    const helper = function(nodes) {
        
        if(!nodes) {
            return result;
        }
        
        helper(nodes.left);
        result.push(nodes.val);
        helper(nodes.right);
        
        return nodes;
    }
    
    helper(root);
    
    return result;
};