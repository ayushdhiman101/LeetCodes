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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        if(head.next==null) return true;
        ListNode temp=head;
        while(head!=null ){
            stack.push(head.val);
            head=head.next;
        }
        while(!stack.isEmpty() || temp!=null){
            if(stack.peek()!=temp.val) return false;
            stack.pop();
            temp=temp.next;
        }
        return stack.isEmpty() ? true:false;
        
    }
}