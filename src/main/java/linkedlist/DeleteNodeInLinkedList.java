package linkedlist;

public class DeleteNodeInLinkedList {
    public static void main(String[] args) {

    }

    public void deleteNode(ListNode node) {

        while (node.next.next != null) {
            node.val = node.next.val;
            node = node.next;
        }
        node.val = node.next.val;
        node.next = null;
    }
}


/* Optimal solution
                node.val = node.next.val;
                node.next = node.next.next;
                */

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
