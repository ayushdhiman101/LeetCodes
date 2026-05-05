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
        
        if(head==null) return null;
        ListNode temp = head;
        int length=1;
        while(temp.next!=null){
            length++;
            temp=temp.next;
        }
        k%=length;
        int node=length-k;
        ListNode temp2 = head;
        while(node!=1){
            temp2=temp2.next;
            node--;
        }
        temp.next=head;
        ListNode temp3=temp2.next;
        temp2.next=null;
        
        
        return temp3;
    }
}