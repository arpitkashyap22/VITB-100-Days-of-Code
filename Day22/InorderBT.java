package Day22;

import java.util.ArrayList;

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
}

public class InorderBT {
     ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer> ans = new ArrayList<>();
        
        if(root == null){
            return ans;
        }
        
        ans.addAll(inOrder(root.left));
        ans.add(root.data);
        ans.addAll(inOrder(root.right));
        
        return ans;
        
    }
}
