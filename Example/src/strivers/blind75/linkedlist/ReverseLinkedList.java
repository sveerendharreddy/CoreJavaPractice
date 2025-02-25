package strivers.blind75.linkedlist;

public class ReverseLinkedList {

    // Definition for singly-linked list.
    static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    public static void main(String[] args) {
        System.out.println("Hello");
        ListNode node3 = new ListNode(3, null);
        ListNode node1 = new ListNode(2, node3);
        ListNode node = new ListNode(1 , node1);

        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        reverseLinkedList.traverse(node);
        ListNode result = reverseLinkedList.reverseList(node);
        System.out.println("Reverse");
        reverseLinkedList.traverse(result);


    }

    public ListNode reverseList(ListNode head) {
        ListNode prevNode = null;
        while(head != null){
           ListNode nextNode = head.next;
            head.next = prevNode;
            prevNode = head;
            head = nextNode;
        }
        return prevNode ;
    }

    public void traverse(ListNode head){
        while (head != null){
            System.out.print(head.val + " --> ");
            head = head.next;
        }
        System.out.print("NULL");
    }
}
