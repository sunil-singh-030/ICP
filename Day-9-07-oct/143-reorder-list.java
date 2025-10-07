class Solution {
    public void reorderList(ListNode head) {
        // Find the midpoint
        // Fast Slow Pointer 
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next; 
            slow = slow.next;
        }
        // Cut the linked list into two halves
        // Example:
        // First half:  1 -> 2 -> 3 -> null
        // Second half: 4 -> 5 -> null
        ListNode second = slow.next;
        slow.next = null;
        // Reverse second half of the linked list
        ListNode prev = null;
        while (second != null){
            ListNode curr = second.next;
            second.next = prev;
            prev = second;
            second = curr;
        }
        // Merge Two Halves
        ListNode first = head;
        second = prev;
        while (second != null){
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;
            first.next = second;
            second.next = temp1;
            first = temp1;
            second = temp2;
        }
    }
}
