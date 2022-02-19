package linkedlist;

public class PalindromeLinkedList {

    public static void main(String[] args) {
        ListNode listNode = new ListNode
                (1, new ListNode
                        (2, new ListNode
                                (3, new ListNode
                                        (4, new ListNode
                                                (5, new ListNode
                                                        (6 , new ListNode
                                                                (7, new ListNode
                                                                        (8 , null))))))));
        System.out.println(isPalindrome(listNode));
    }

    static class ListNode {
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

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }
/*
    //19 ms
    public boolean isPalindrome(ListNode head) {

        List<Integer> list = new ArrayList<>();

        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        int size = list.size() - list.size() / 2;
        int sizeArr = list.size()-1;
        for (int i = 0; i < size; i++) {
            if (!Objects.equals(list.get(i), list.get(sizeArr-i))) return false;
        }
        return true;
    }*/

    //5ms
    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        ListNode fast = head, slow = head, rev = null;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            ListNode next = slow.next;
            slow.next = rev;
            rev = slow;
            slow = next;
        }

        if (fast != null) slow = slow.next;
        while (rev != null && slow != null) {
            if (rev.val != slow.val) return false;
            rev = rev.next;
            slow = slow.next;
        }
        return true;
    }
}
