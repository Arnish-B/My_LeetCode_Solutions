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
    public ListNode middleNode(ListNode head) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        ListNode temp = head;
        int i = 0;
        while(temp!=null){
            mp.put(i,temp.val);
            i++;
            temp = temp.next;
        }
        int mid = i/2 + 1;
        System.out.println(i + " " + mid);
        temp = head;
        i = 1;
        while(temp!=null){
            if(i == mid){
                head = temp;
                break;
            }
            temp = temp.next;
            i += 1;
        }
        return head;
    }
}