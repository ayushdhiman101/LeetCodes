/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode temp = head;
        ListNode dummy = new ListNode(-1);
        ListNode dummyHead=dummy;
        
        while(temp!=null){
            if(temp.val<x){
                ListNode node = new ListNode(temp.val);
                dummy.next=node;
                dummy=dummy.next;
            }
            temp=temp.next;
        }
        temp=head;
         while(temp!=null){
            if(temp.val>=x){
                ListNode node = new ListNode(temp.val);
                dummy.next=node;
                dummy=dummy.next;
            }
            temp=temp.next;
        }
        return dummyHead.next;
    }
}