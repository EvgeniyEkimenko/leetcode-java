package linkedlist;

public class LinkedListCycle {

    public static void main(String[] args) {

    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    // 6 ms  (Your runtime beats 14.46 % of java submissions.)
/*    public boolean hasCycle(ListNode head) {

        ListNode node = head;
        Set<ListNode> hashSet = new HashSet<>();

        while (node!=null) {
            boolean flag = hashSet.add(node);
            node = node.next;
            if (!flag) return true;
        }
        return false;
    }*/

    // 0 ms (Your runtime beats 100.00 % of java submissions)

    public static boolean hasCycle(ListNode head) {

        if (head == null || head.next == null) return false;

        ListNode node = head;

        while (node.next != null) {
            node.val = Integer.MAX_VALUE;
            node = node.next;
            if (node.val == Integer.MAX_VALUE) return true;
        }
        return false;
    }

    //Также можно применить метод двух указателей (fast и slow). Если fast==slow - значит есть цикл!
}
