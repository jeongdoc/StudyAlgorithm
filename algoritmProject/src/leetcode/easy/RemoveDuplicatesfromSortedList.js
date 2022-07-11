// 83. Remove Duplicates from Sorted List
/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
//  Input: head = [7,1,1,2,3]
//  Output: [1,2,3,7]
var deleteDuplicates = function(head) {
    
    const newNode = new ListNode(null);
    let curr = newNode;
    
    while(head) {
        if(head.val !== curr.val) {
            curr.next = head;
            curr = curr.next;
        }
        
        head = head.next;
    }
    
    curr.next = null;
    
    return newNode.next;
    
//     if(!head) {
//         return head;
//     }
    
//     let curr = head;
    
//     while(curr.next !== null) {
        
//         if(curr.val === curr.next.val) {
//             curr.next = curr.next.next;
//         } else {
//             curr = curr.next;
//         }
        
//     }
    
//     return head;
    
};