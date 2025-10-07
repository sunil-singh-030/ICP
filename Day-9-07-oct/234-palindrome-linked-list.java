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
        List<Integer> ls = new ArrayList<>();
        ListNode temp = head;
        while (temp!=null){
            ls.add(temp.val);
            temp = temp.next;
        }
        for (int i=0 ; i<ls.size()/2 ; i++){
            if (ls.get(i)!=ls.get(ls.size()-1-i)){
                return false;
            }
        }
        return true;
    }
}
