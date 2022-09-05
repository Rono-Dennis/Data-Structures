/*
You are given the pointer to the head node of a linked list and an integer to add to the list. Create a new node with the given integer. Insert this node at the tail of the linked list and return the head node of the linked list formed after inserting this new node. The given head pointer may be null, meaning that the initial list is empty.

        Function Description

        Complete the insertNodeAtTail function in the editor below.

        insertNodeAtTail has the following parameters:

        SinglyLinkedListNode pointer head: a reference to the head of a list
        int data: the data value for the node to insert
        Returns

        SinglyLinkedListNode pointer: reference to the head of the modified linked list
        Input Format

        The first line contains an integer , the number of elements in the linked list.
        The next  lines contain an integer each, the value that needs to be inserted at tail.

        Constraints

        Sample Input

        STDIN Function ----- -------- 5 size of linked list n = 5 141 linked list data values 141..474 302 164 530 474

        Sample Output

        141
        302
        164
        530
        474
        Explanation

        First the linked list is NULL. After inserting 141, the list is 141 -> NULL.
        After inserting 302, the list is 141 -> 302 -> NULL.
        After inserting 164, the list is 141 -> 302 -> 164 -> NULL.
        After inserting 530, the list is 141 -> 302 -> 164 -> 530 -> NULL. After inserting 474, the list is 141 -> 302 -> 164 -> 530 -> 474 -> NULL, which is the final list.
*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LInkedlist {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;

        public SinglyLinkedList() {
            this.head = null;
        }


    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }

    // Complete the insertNodeAtTail function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode temp = head;
        if(temp == null){
            head = new SinglyLinkedListNode(data);
            return head;
        }
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = new SinglyLinkedListNode(data);
        return head;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        SinglyLinkedList llist = new SinglyLinkedList();

        int llistCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < llistCount; i++) {
            int llistItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            SinglyLinkedListNode llist_head = insertNodeAtTail(llist.head, llistItem);

            llist.head = llist_head;
        }



        printSinglyLinkedList(llist.head, "\n", bufferedWriter);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
