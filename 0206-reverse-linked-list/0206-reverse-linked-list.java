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
    public ListNode reverseList(ListNode head)
    {
        Stack<Integer> stack=new Stack<>(); 
        while(head!=null)
        {
            stack.push(head.val);
            head=head.next;
        }
        ListNode cur=null;
        ListNode newHead=null;
        while(!stack.isEmpty())
        {
            if(newHead==null)
            {
                newHead=new ListNode(stack.pop());
                cur=newHead;
            }
            else
            {
                cur.next=new ListNode(stack.pop());
                cur=cur.next;
            }
        }
        return newHead;
    }
}