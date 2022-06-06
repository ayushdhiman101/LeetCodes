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
        int len1=0,len2=0;
        ListNode tempA=headA,tempB=headB;
        while(tempA!=null){
            len1++;
            tempA=tempA.next;
        }
        while(tempB!=null){
            len2++;
            tempB=tempB.next;
        }
        
        tempA=headA;tempB=headB;
        
        if(len2>len1){
            int diff=len2-len1;
            while(diff!=0){
                tempB=tempB.next;
                diff--;                
            }
        }
        else if (len2<len1){
            int diff=len1-len2;
            while(diff!=0){
                tempA=tempA.next;
                diff--;                
            }
        }
        
        while(tempA!=tempB){
            //if((tempA==null || tempB==null)) return null;
            tempA=tempA.next;
            tempB=tempB.next;
        }
        return tempA;
        
        
        
    }
}