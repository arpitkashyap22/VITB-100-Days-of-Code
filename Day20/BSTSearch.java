package Day20;




class BSTSearch {

    class Node {
    int data;
    Node left;
    Node right;
    Node(int d) {
        data = d;
        left = right = null;
    }

    boolean search(Node root, int x) {
        // Your code here
        if (root.data == x){
            return true;
        }
       
        if(root.data > x && root.left != null){
            return search(root.left, x);
        }
        if(root.data < x && root.right !=null){
            return search(root.right, x);
        }
        return false;
    }
}


}


