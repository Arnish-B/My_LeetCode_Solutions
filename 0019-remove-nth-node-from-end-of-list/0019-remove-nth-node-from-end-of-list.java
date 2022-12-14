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
        HashMap<Integer,Integer> mp = new HashMap<>();
        int i =0;
        ListNode temp = head;
        while(temp!=null){
            mp.put(i,temp.val);
            temp = temp.next;
            i += 1;
        }
        if(i == 1 && n == 1){
            head = null;
            return head;
        }
        else if(n == i){
            head = head.next;
            return head;
        }
        int pos = i - n;
        int del = mp.get(pos);
            temp = head;
            int j = 0;
            while(temp.next!=null){
                if(temp.next.val == del && j + 1 == pos){
                    if(temp.next.next == null){
                        temp.next = null;
                        return head;
                    }
                    else{
                        temp.next = temp.next.next;
                        return head;
                    }
                }
                temp = temp.next;
                j += 1;
            }
        
        return head;
    }
}