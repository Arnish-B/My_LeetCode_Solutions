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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count =0;
        ListNode temp = head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        
        
        
        if(n == count)
        {
            temp = head;
            head = head.next;
            return head;
        }
        
        
        else if(n == 1)
        {
            temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
    
            }
            temp.next=null;
            return head;
        }
        
        
        else if(n==0){
            temp = head;
            int counter=0;
            
             while(temp!=null)
                {
                    if(counter == count-1){
                        temp.next = null;
                        break;
                    }
                 temp=temp.next;
                 counter++;
                }
            return head;
        }
        
        
        count = count-n;
        temp = head;
        int counter=0;
        ListNode temp1;
        
        while(temp!=null)
        {
            if(counter == count-1){
                temp1 = temp.next;
                temp.next = temp.next.next;
                temp1.next = null;
                break;
            }
            temp=temp.next;
            counter++;
        }
        return head;
    }
}