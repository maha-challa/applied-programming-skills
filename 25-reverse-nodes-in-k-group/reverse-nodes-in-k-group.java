class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;

        while (true) {
            
            ListNode node = prev;
            for (int i = 0; i < k && node != null; i++) {
                node = node.next;
            }
            if (node == null) break; 

            ListNode curr = prev.next;
            ListNode nextPrev = curr; 
            ListNode next = null;
            ListNode temp = null;

            for (int i = 0; i < k; i++) {
                temp = curr.next;
                curr.next = next;
                next = curr;
                curr = temp;
            }

            prev.next = next;
            nextPrev.next = curr;

            prev = nextPrev;
        }

        return dummy.next;
    }
}
