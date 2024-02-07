package Day78;

import java.util.LinkedList;
import java.util.Scanner;
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    private Node top;
    private int size;

    public Stack() {
        this.top = null;
        this.size = 0;
    }

    // Push data into the stack
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    // Pop data from the stack
    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        int poppedData = top.data;
        top = top.next;
        size--;
        return poppedData;
    }

    // Get the top element of the stack
    public int top() {
        if (isEmpty()) {
            return -1;
        }
        return top.data;
    }

    // Get the size of the stack
    public int size() {
        return size;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return size == 0;
    }
}

public class StackLL{
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        Stack stack = new Stack();

        while (q-- > 0) {
            int operation = scanner.nextInt();
            switch (operation) {
                case 1:
                    int data = scanner.nextInt();
                    stack.push(data);
                    break;
                case 2:
                    System.out.println(stack.pop());
                    break;
                case 3:
                    System.out.println(stack.top());
                    break;
                case 4:
                    System.out.println(stack.size());
                    break;
                case 5:
                    System.out.println(stack.isEmpty());
                    break;
            }
        }
    }
}

