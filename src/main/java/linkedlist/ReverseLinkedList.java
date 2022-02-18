package linkedlist;

public class ReverseLinkedList {

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
    }

    public ListNode reverseList(ListNode head) {

        //1->2->3->4->5->null
        //null<-5<-4<-3<-2<-1
        ListNode currentNode = head;
        ListNode previousNode = null;

        while (currentNode!=null) {
            ListNode nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }
        return previousNode;
    }
}
