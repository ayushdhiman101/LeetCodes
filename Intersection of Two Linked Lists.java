/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int n1=0;
        int n2=0;
        ListNode a=headA;
        ListNode b=headB;
        while(a!=null){
            n1++;
            a=a.next;
            }
        while(b!=null){
            n2++;
            b=b.next;
            }
        a=headA;
        b=headB;
        if(n1>n2){
            while(n1!=n2){
                a=a.next;
                n1--;
                }
            }
        if(n2>n1){
            while(n2!=n1){
                b=b.next;
                n2--;
                }
            }
        while(a!=b){
            a=a.next;
            b=b.next;
            }
        return a;
    }
}
