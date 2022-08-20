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
    public ListNode mergeNodes(ListNode head) {
        List<Integer> li = new ArrayList<>();
        int sum =0;
        int flag =0;
        ListNode temp = head;
        while(temp!=null){
            if( temp.val == 0 && flag == 0 ){
                flag = 1;
            }
            else if(temp.val == 0){
                li.add(sum);
                sum = 0;
            }
            else{
                sum += temp.val;
            }
            temp = temp.next;
        }
        System.out.println(li);
        temp = head;
        int i=0;
        while(i<li.size()){
            temp.val=li.get(i);
            i++;
            if(i == li.size()){
                temp.next = null;
                break;
            }
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
}