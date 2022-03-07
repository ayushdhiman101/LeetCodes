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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode newList=new ListNode(-1);
        ListNode ptr=newList;
        ListNode ans=newList;
        
        if(l1==null) 
            return l2;
        if(l2==null)
            return l1;
                
        while(l1!=null && l2!=null ){
            //if(l2==null) break;
            //if(l1==null) break;
            
            if(l1.val<l2.val){
                ListNode newNode=new ListNode(l1.val);
                ptr.next=newNode;
                ptr=ptr.next;
                l1=l1.next;
            }
            else if(l1.val>l2.val){
                ListNode newNode=new ListNode(l2.val);
                ptr.next=newNode;
                ptr=ptr.next;
                l2=l2.next;
            }
            else{
                ListNode newNode=new ListNode(l2.val);
                ListNode newNode2=new ListNode(l2.val);

                ptr.next=newNode;
                ptr=ptr.next;
                ptr.next=newNode2;
                ptr=ptr.next;
                l1=l1.next;
                l2=l2.next;
            }
        }
        
        if(l1==null && l2!=null){
            while(l2!=null){
                ListNode newNode=new ListNode(l2.val);
                ptr.next=newNode;
                ptr=ptr.next;
                l2=l2.next;
            }
            
        }
        if(l2==null && l1!=null){
            while(l1!=null){
                ListNode newNode=new ListNode(l1.val);
                ptr.next=newNode;
                ptr=ptr.next;
                l1=l1.next;
            }
            
        }
       return ans.next; 
    }
}