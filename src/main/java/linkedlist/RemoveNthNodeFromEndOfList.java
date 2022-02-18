package linkedlist;

public class RemoveNthNodeFromEndOfList {


    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode s = new ListNode();
        s.next = head;
        ListNode fast = s;
        ListNode slow = s;

        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;

        }

        slow.next = slow.next.next;
        return s.next;
    }

}
