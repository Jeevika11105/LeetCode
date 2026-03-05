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
        //Find mid and split
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        // reverse the right half 
        ListNode prev = null;
        while(slow != null){
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }
        //check right and left 
        ListNode dummy = head;
        while(prev != null){
            if(dummy.val != prev.val) return false;
            dummy = dummy.next;
            prev = prev.next;
        }
        return true;
    }
}