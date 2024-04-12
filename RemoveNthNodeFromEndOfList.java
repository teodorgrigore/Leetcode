public class RemoveNthNodeFromEndOfList {

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

    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode it = head;

        int len = 0;

        while (it != null) {
            len++;
            it = it.next;
        }
        int target = len - n;
        it = head;
        if (target == 0) return head.next;

        for (int i = 0; i < len; ++i) {
            if (it.next != null && i == target - 1) {
                it.next = it.next.next;
                break;
            }
            it = it.next;
        }

        return head;
    }
}
