package Day23;

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
}

public class InsertBST {
     Node insert(Node root, int Key) {
        // your code here
        
        if(root == null){
            Node newNode = new Node(Key);
            return newNode;
        }
        
        if(Key>root.data){
            root.right = insert(root.right, Key);
        }
        
        if(Key<root.data){
            root.left =  insert(root.left, Key);
        }
        return root;
}
