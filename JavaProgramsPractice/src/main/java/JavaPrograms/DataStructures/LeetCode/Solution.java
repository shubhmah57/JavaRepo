package JavaPrograms.DataStructures.LeetCode;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int firstList =0;
        int secondList=0;
        int carry=0;
        int output=0;
        ListNode finalList = new ListNode();
        while(l1.next!=null || l2.next!=null){
            firstList = l1.val;
            secondList= l2.val;
            int sum = carry+firstList+secondList;
            carry= sum/10;
            output= sum%10;
            new ListNode (output, finalList);
            l1=l1.next;
            l2=l2.next;
        }
       return finalList;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode = new ListNode(3,new ListNode());
    }
}