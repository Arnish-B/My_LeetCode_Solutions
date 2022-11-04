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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry =0;
        int val = 0;
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        List<Integer> li = new ArrayList<>();

        while(true){
            if(l1 == null && l2!=null){
                val = l2.val + carry;
                 if(val >= 10){
                    carry = val/10;
                    val = val%10;
                }
                else{
                    carry = 0;
                }
                l2 = l2.next;
                li.add(val);
            }
            else if(l1 != null && l2 == null){
                val = l1.val + carry;
                 if(val >= 10){
                    carry = val/10;
                    val = val%10;
                }
                else{
                    carry = 0;
                }
                l1 = l1.next;
                li.add(val);
            }
            else if(l1!=null && l2!=null){
                val = l1.val + l2.val + carry;
                // System.out.println(l1.val + " " + l2.val + " " + carry);
                if(val >= 10){
                    carry = val/10;
                    val = val%10;
                }
                else{
                    carry = 0;
                }
                li.add(val);
                l1 = l1.next;
                l2 = l2.next;
            }
            else if(l1 == null && l2 == null && carry > 0){
                li.add(1);
                break;
            }
            else{
                break;
            }
            
        }
        
        
        for(int i:li){
            ListNode node = new ListNode(i);
            curr.next = node;
            curr = curr.next;
        }
        return dummy.next;       
    }
}