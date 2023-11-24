package Day14;

class DoublyLL {
    public Node head, tail;

    class Node {
        private int data;
        private Node prev, next;

        Node(int item) {
            data = item;
            next = prev = null;
        }
    }

    public void addNode(int n){
        Node newNode = new Node(n);
        if(head == null){
            head = tail = newNode;
            head.prev = null;
            tail.next = null;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        tail.next = null;
    }

    public Node sortedInsert(int x){
        Node newNode = new Node(x);
        if (head == null || x < head.data) {
            if(head!=null){
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
            return head;
        }

        Node curr = head;
        Node prevNode = curr;

        while(curr != null && curr.data <= x){
            prevNode = curr;
            curr = curr.next;
        }
        
        prevNode.next = newNode;
        newNode.prev = prevNode;

        if(curr != null){
            newNode.next = curr;
            curr.prev = newNode;
        }

        return head;
    }

    public void display(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node curr = head;

        while (curr != null){
            System.out.print(curr.data + " <-> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
}

public class AddinSortedDLL {
    public static void main(String[] args) {
        DoublyLL dl = new DoublyLL();
        dl.addNode(1);
        dl.addNode(3);
        dl.addNode(4);
        dl.display();
        dl.sortedInsert(3);
        dl.display();
    }
}
