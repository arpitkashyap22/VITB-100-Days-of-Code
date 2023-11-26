package Day16;

import java.util.Stack;

class Queue
{
    Stack<Integer> input = new Stack<Integer>(); 
    Stack<Integer> output = new Stack<Integer>(); 
    
    /*The method pop which return the element poped out of the stack*/
    int dequeue()
    {
	    // Your code here
	    if(output.isEmpty()){
	        if(input.isEmpty()){
	            return -1;
	        }
	        while(!input.isEmpty()){
	            output.push(input.pop());
	        }
	    }
	    
	    return output.pop();
    }
	
    /* The method push to push element into the stack */
    void enqueue(int x)
    {
	    // Your code here	
	    input.push(x);
    }
}

public class QueueUsingStack{
    public static void main(String[] args) {
        Queue q =new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        
        q.enqueue(1);
         System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}