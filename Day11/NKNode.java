package Day11;

import java.util.Scanner;


public class NKNode {
   
     public static int nknode(Node head, int k){
          // add your code here
          if(head == null){
            return -1;
        }
        int n = 1;
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
            n++;
        }

        temp = head;
        int nk = (int)Math.ceil((double)n/k);
        for (int i = 1; i <nk; i++) {
            temp = temp.next;
        }

        return temp.value;
        
     }
    
    private static void addAtLast(Node head,int value){
       

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
            System.out.println("Enter head value :");
            
            Node head = new Node(sc.nextInt()); 
            for (int i = 1; i < no; i++) {
                System.out.println("Enter next value : ");
                addAtLast(head, sc.nextInt());
            }

             System.out.println("enter index :");
            int index = sc.nextInt();

            System.out.println("Va2lue at N/" + index + " index is :" + nknode(head, index));
            
        }

        sc.close();
    }
}
