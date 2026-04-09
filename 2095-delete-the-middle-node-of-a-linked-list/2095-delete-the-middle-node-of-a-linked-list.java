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
/*class Solution {
    public ListNode deleteMiddle(ListNode head) {
       ListNode Slow = head;
       if(head == null || head.next == null) return null;
       ListNode Fast = Slow.next.next;
       while(Fast != null && Fast.next != null){
            Slow = Slow.next;
            Fast = Fast.next.next;
       } 
       Slow.next = Slow.next.next;
       return head;
    }
}*/

class Solution{
    public ListNode deleteMiddle(ListNode head){
        if(head == null || head.next == null ) return null;
        ListNode fast = head;
        ListNode slow = head;
        ListNode temp = null;
        while(fast != null && fast.next != null){
            temp = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        temp.next = slow.next;
        return head;
    }
}