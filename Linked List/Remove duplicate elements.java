//Problem Statement: To Remove Duplicate Elements from the List #LC83.
class Solution {
    public ListNode removedup(ListNode head) {
        ListNode temp=head;
        while(temp!= null && temp.next != null){
            if(temp.val==temp.next.val){
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
            }
        }
        return head;
    }
}
