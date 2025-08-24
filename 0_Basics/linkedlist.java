class ListNode {

      int data;
      ListNode next;

      public ListNode(int data) {
            this.data = data;
            next = null;
      }

};

public static void traversal(ListNode root) {

      ListNode temp = root;

      while (temp != null) {

            System.out.println(temp.data);
            temp = temp.next;
      }

}

public class linkedlist {
      public static void main(String[] args) {

            ListNode root = new ListNode(1);
            ListNode first = new ListNode(2);
            ListNode second = new ListNode(3);
            ListNode third = new ListNode(4);

            root.next = first;
            first.next = second;
            second.next = third;
            third.next = null;

            traversal(root);

      }
}
