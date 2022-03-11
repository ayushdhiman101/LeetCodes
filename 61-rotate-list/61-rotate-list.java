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
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        k = k % count;
        if(k==0) return head;
        
        int b=count-k-1;
        temp=head;
        while(temp.next!=null && b!=0){
            temp=temp.next;
            b--;
        } 
       // ListNode nextNode=temp;
       // if(temp.next!=null)
            ListNode nextNode=temp.next;
        ListNode ans=nextNode;
        while(nextNode.next!=null) nextNode=nextNode.next;
        
        nextNode.next=head;
        temp.next=null;
        
        
        
        return ans;
        
    }
}