package Day18;

import java.util.Scanner;

class BinaryTree{
    private static class Node {
        int value;
        Node left, right;
        Node(int value){
            this.value = value;
        }
    }
    private Node root;


    //populate inserting element;

    public void populate(Scanner sc){
        System.out.println("Enter value of root node : ");
        int value = sc.nextInt();
        root  = new Node(value);
    }

    public void populate(Scanner sc, Node node){
        
        //populating left values

        System.out.println("Do you want to enter left of " + node.value);
        boolean left  = sc.nextBoolean();
        if(left){
            System.out.println("Enter value to be inserted in left of " + node.value);
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc, node.left);
        }

        // populating right  values
        System.out.println("Do you want to enter right of " + node.value);
        boolean right = sc.nextBoolean();
        if(right){
            System.out.println("Enter value to be inserted in the right of " + node.value);
            int value =  sc.nextInt();
            node.right = new Node(value);
            populate(sc, node.right);
        }
    }
}

public class BinaryTreeImplement {
    public static void main(String[] args) {
        
    }
}
