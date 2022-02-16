  class Solution {

        public ListNode swapPairs(ListNode head) {
            ListNode dummy = new ListNode(-1);
            ListNode prev = dummy;
            ListNode current = head;
            dummy.next = head;
            
            while (current != null && current.next != null) {
                prev.next = current.next;
                current.next = current.next.next;
                prev.next.next = current;
                current = current.next;
                prev = prev.next.next;
            }

            return dummy.next;
        }
    }