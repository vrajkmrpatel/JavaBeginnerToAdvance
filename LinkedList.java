import java.io.*;

public class LinkedList {

    Node head;

    static class Node {
        int data;
        Node next;

        // constructor Node
        Node(int d) {
            data = d;
            next = null;
        }
    }

    // insert a node
    public static LinkedList insert(LinkedList list, int data) {
        Node new_node = new Node(data);

        if (list.head == null) {
            list.head = new_node;
        } else {

            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            last.next = new_node;
        }
        return list;
    }

    // deletion by key
    public static LinkedList deleteByKey(LinkedList list, int key) {
        Node currNode = list.head, prev = null;

        // case 1 - if head itself holds key to be deleted

        if (currNode != null && currNode.data == key) {
            list.head = currNode.next;

            System.out.println(key + " found and deleted");

            return list;
        }

        // case 2 - if key is somewhere other than at head

        // search for the key and keep track of prev node as it will needed
        while (currNode != null && currNode.data != key) {

            prev = currNode;
            currNode = currNode.next;
        }

        if (currNode != null) {
            prev.next = currNode.next;

            System.out.println(key + " found and deleted");
        }

        // case 3 - the key is not present

        if (currNode == null) {
            System.out.println(key + " not found");
        }

        return list;
    }

    // deletion at a position
    public static LinkedList deleteAtPosition(LinkedList list, int index) {
        Node currNode = list.head, prev = null;

        // case 1 - if index is 0, then head node itself is to be deleted
        if (index == 0 && currNode != null) {
            list.head = currNode.next;

            System.out.println(index + " position element deleted");

            return list;
        }

        // case 2 - if index is greater than 0 but less than the size of list
        int counter = 0;

        while (currNode != null) {

            if (counter == index) {
                prev.next = currNode.next;

                System.out.println(index + " position element deleted");
                break;
            } else {
                prev = currNode;
                currNode = currNode.next;
                counter++;
            }
        }

        // case 3 - index is greater than the size of the LinkedList

        if (currNode == null) {
            System.out.println(index + " position element not found");
        }

        return list;
    }

    // print the list
    public static void printList(LinkedList list) {
        Node currNode = list.head;

        System.out.print("LinkedList: ");

        while (currNode != null) {
            System.out.print(currNode.data + " ");

            currNode = currNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list = insert(list, 10);
        list = insert(list, 20);
        list = insert(list, 30);
        list = insert(list, 40);
        list = insert(list, 50);
        list = insert(list, 60);

        printList(list);

        deleteByKey(list, 11);

        printList(list);

        deleteByKey(list, 50);

        printList(list);

        deleteAtPosition(list, 3);

        printList(list);

    }
}
