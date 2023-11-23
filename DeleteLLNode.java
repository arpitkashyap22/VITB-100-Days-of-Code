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
public class DeleteLLNode {
    static Node deleteNode(Node head, int x)
    {
	// Your code here
	if(x == 1){
	    head = head.next;
	    return head;
	}
	Node temp = head;
	
	for(int i = 2; i<x; i++){
	    temp = temp.next;
	}
	
	temp.next = temp.next.next;
	
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
        System.out.println("enter node to be deleated :");
        int x = sc.nextInt();
        display(deleteNode(head, x));

        sc.close();
    }
}
