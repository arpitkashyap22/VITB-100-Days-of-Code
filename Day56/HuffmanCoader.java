package Day56;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class HuffmanCoader {
     class Node implements Comparable<Node>{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
        
        public int compareTo(Node other){
            if(this.data == other.data){
                return 1;
            }
            return this.data - other.data;
        }
    }
    
    public void preorder(Node root,String str, ArrayList<String> res){
        if(root.left == null && root.right == null){
            res.add(str);
            return;
        }
        preorder(root.left, str + "0", res);
        preorder(root.right,str + "1", res);
    }
    
    public ArrayList<String> huffmanCodes(String S, int f[], int N)
    {
        // Code here
        ArrayList<String> res = new ArrayList<>();
        PriorityQueue<Node> pq = new PriorityQueue<>();
        
        for(int i : f){
            Node temp = new Node(i);
            pq.add(temp);
        }
        
        while(pq.size() > 1){
            Node left = pq.poll();
            Node right = pq.poll();
            Node parent = new Node(left.data + right.data);
            parent.left = left;
            parent.right = right;
            pq.add(parent);
        }
        Node root = pq.poll();
        preorder(root,"",res);
        return res;
    }
}
