package Day22;

import java.util.ArrayList;

public class PostorderBT {
     ArrayList<Integer> postOrder(Node root)
    {
       // Your code goes here
       
       ArrayList<Integer> ans = new ArrayList<>();
       
       if(root == null){
           return ans;
       }
       
       ans.addAll(postOrder(root.left));
       ans.addAll(postOrder(root.right));
       ans.add(root.data);
       
        return ans;
    }
}
