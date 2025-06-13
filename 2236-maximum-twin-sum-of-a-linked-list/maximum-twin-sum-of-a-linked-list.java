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
    public int pairSum(ListNode head) {
        ArrayList<Integer>values=new ArrayList<>();
        while(head!=null){
            values.add(head.val);
            head=head.next;
        }
        int n=values.size();
        int  maxSum=0;
        for(int i=0;i<n/2;i++){
            int twinSum=values.get(i)+values.get(n-i-1);
            maxSum=Math.max(maxSum,twinSum);
        }
        return maxSum;
    }
}