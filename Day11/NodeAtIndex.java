package Day11;

import java.util.Scanner;

class Node{
    int value;
    Node next;
    Node(int value){
        this.value = value;
        next = null;
    }
}

public class NodeAtIndex {

    public static int getNth(Node node, int ind)
    {
       //Your code here
       if(node == null){
           return -1;
       }
       Node temp = node;
       for (int i = 1; i < ind; i++) {
         temp = temp.next;
       }
       return temp.value;
    }
    
    public static void addAtLast(Node head,int value){
       

        if(head == null){
            head = new Node(value);
            return;
        }

        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = new Node(value);
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("No. of test cases :");
        int n = sc.nextInt();
        while(n-- > 0){
            System.out.print("Enter no of nodes");
            int no = sc.nextInt();
            System.out.println("enter index :");
            int index = sc.nextInt();
            System.out.println("Enter head value :");
            
            Node head = new Node(sc.nextInt()); 
            for (int i = 1; i < no; i++) {
                System.out.println("Enter next value : ");
                addAtLast(head, sc.nextInt());
            }

            System.out.println("Va2lue at " + index + "th index is :" + getNth(head, index));
            
        }

        sc.close();
    }
}
