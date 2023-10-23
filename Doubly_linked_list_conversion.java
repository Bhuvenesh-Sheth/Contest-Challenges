
//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

// Node class
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

// Driver class
class Doubly_linked_list_conversion {

    // function to print doubly linked list
    static void printLL2(Node head) {

        if (head == null) {
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        Node tail = temp;
        // System.out.println(tail.data);

        while (tail.prev != null) {

            System.out.print(tail.data + " <- ");
            tail = tail.prev;
        }
        if (tail.prev == null) {
            System.out.println(tail.data);
        }
    }

    // Driver code
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t > 0) {

            Node head = null;

            // size of linked list
            int n = sc.nextInt();

            // taking first node as input and assigning it as head
            if (n > 0) {
                int x = sc.nextInt();
                head = new Node(x);
            }

            n--;
            Node temp = head;

            // taking other node as input
            while (n-- > 0) {

                int x1 = sc.nextInt();

                while (temp.next != null) {
                    temp = temp.next;
                }

                temp.next = new Node(x1);
            }

            GfgNew.makeDoubly(head);
            printLL2(head);

            t--;
        }
    }
}

// } Driver Code Ends

// User function Template for Java

class GfgNew {
    // Function to convert singly linked list to doubly
    static void makeDoubly(Node head) {
        // Your code here
        head.prev = null;
        Node back = head;
        Node front = head.next;

        while (front != null) {
            front.prev = back;
            back = back.next;
            front = front.next;
        }
    }
}