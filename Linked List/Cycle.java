//Problem Statement: check whether their is a cycle in a linkedlist #LC141
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        ListNode fast=head;
        ListNode slow=head;
        while(fast != null && fast.next != null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                return true;
                }
        }
        return false;
    }
}
