//Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. Return the linked list sorted as well.

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode sentinel = new ListNode(0, head);
        ListNode pred = sentinel;
        
        while (head != null) {
            if (head.next != null && head.val == head.next.val) {
                while (head.next != null && head.val == head.next.val) {
                    head = head.next;    
                }
                pred.next = head.next;     
            } else {
                pred = pred.next;    
            }
                
            head = head.next;    
        }  
        return sentinel.next;
    }
}
