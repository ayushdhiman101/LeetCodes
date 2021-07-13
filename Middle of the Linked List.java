// Given a non-empty, singly linked list with head node head, return a middle node of linked list.

// If there are two middle nodes, return the second middle node.

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;
        int count=1;
        if(temp.next==null) return head;
        
        while(temp.next!=null){
            count++;
            temp=temp.next;
        }
        
        ListNode temp2=head;
        int a=(int)count/2;
        
        while(a!=0){
            temp2=temp2.next;
            a--;
        }
        return temp2;
        
    }
}
