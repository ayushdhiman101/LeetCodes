// You are given the head of a singly linked-list. The list can be represented as:

// L0 → L1 → … → Ln - 1 → Ln
// Reorder the list to be on the following form:

// L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
// You may not modify the values in the list's nodes. Only nodes themselves may be changed.

class Solution {
    public void reorderList(ListNode head) {
        ListNode temp = head;
        ListNode storenext = head;
        ListNode last = head;

        if (temp.next != null) {
            int count = 1;
            while (temp.next.next != null) {
                temp = temp.next;
                count++;
            }
            for (int i = 0; i < count / 2; i++) {
                while (temp.next.next != null)
                    temp = temp.next;
                last = temp;
                temp = temp.next;
                storenext = head.next;
                head.next = temp;
                temp.next = storenext;
                last.next = null;
                head = head.next.next;
            }
        }
    }
}