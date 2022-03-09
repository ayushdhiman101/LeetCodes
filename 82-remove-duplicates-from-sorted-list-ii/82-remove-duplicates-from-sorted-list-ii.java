// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//     public ListNode deleteDuplicates(ListNode head) {
//         ListNode node = new ListNode(-1);
//         ListNode listptr = node; 
//         ListNode headptr = head;
        
//         while(headptr.next != null){
//             if(headptr.next.val != headptr.val){
//                 ListNode newnode = new ListNode(headptr.next.val);
//                 listptr.next=newnode;
//                 listptr=listptr.next;
//                 headptr=headptr.next; 
//             }
//             else
//                 headptr=headptr.next;
            
            
//         }
//         return node.next;
        
//     }
// }



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