package Day12;

import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(){}
    Node(int value) {
        this.data = value;
        next = null;
    }
}

public class ReverseLL {
    public static Node reverseList(Node head) {
        // code here
        if(head == null){
            return null;
        }

        if(head.next == null){
            return head;
        }

        Node curr = head.next;
        Node prev, next;
        prev = head;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
    
        head.next = null; // Set this to prev instead of null
        head = prev; // Update head to the new first node
    
        return head;
    }

    public static void addAtLast(Node head, int value) {

        if (head == null) {
            head = new Node(value);
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = new Node(value);
    }

    public static void display(Node head){
         if (head == null) {
            System.out.println("Empty list");
            return;
        }

        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null\n");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of nodes");
        int no = sc.nextInt();
        System.out.println("Enter head value :");

        Node head = new Node(sc.nextInt());
        for (int i = 1; i < no; i++) {
            System.out.println("Enter next value : ");
            addAtLast(head, sc.nextInt());
        }
        display(head);
        display(reverseList(head));

        sc.close();
    }
}
