// Given the head of a linked list, rotate the list to the right by k places.

class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || k == 0)
            return head;
        int size = 0;
        ListNode temp = head;
        while (temp.next != null) {
            size++;
            temp = temp.next;
        }

        k = k % (size + 1);
        ListNode temp1 = head;
        int rem = size - k;
        while (rem > 0) {
            temp1 = temp1.next;
            rem--;
        }
        temp.next = head;
        head = temp1.next;
        temp1.next = null;
        return head;
    }
}