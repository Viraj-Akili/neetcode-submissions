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
    public int length(ListNode head){
        int count=0;
        ListNode curr1=head;
        while(curr1!=null){
            count++;
            curr1=curr1.next;
        }
        return count;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len=length(head);
        int n1=len-n;
        if(n1==0){
            return head.next;
        }
        ListNode curr=head;
        for(int i=0;i<n1-1;i++){
            curr=curr.next;
        }
        curr.next=curr.next.next;
        return head;
    }
}
