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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0) return head;
        ListNode temp = head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        k = k % size;
        
        if(k==0) return head;
        
        int rem=size-k-1;
        temp=head;
        while(temp.next!=null && rem!=0){
            temp=temp.next;
            rem--;
        } 
       
        ListNode nextNode=temp.next;
        temp.next=null;
        ListNode newHead = nextNode;
        while(nextNode.next!=null) nextNode=nextNode.next;
        
        nextNode.next=head;
        
        
        
        return newHead ;
        
    }
}