package Day35;

public class TwoStack {
    private int[] stack;
    private int top1, top2;
    
    twoStacks()
    {
        stack = new int[100];
        top1 = -1;
        top2 = stack.length;
    }
    //Function to push an integer into the stack1.
    void push1(int x)
    {
        if(top2 > top1+1){
            stack[++top1] = x;
        }
    }
    //Function to push an integer into the stack2.
    void push2(int x)
    {   
        if(top1<top2-1){
            stack[--top2] = x;
        }
    }
    //Function to remove an element from top of the stack1.
    int pop1()
    {
        if(top1 == -1){
            return -1;
        }
        int x = stack[top1--];
        return x;
    }
    //Function to remove an element from top of the stack2.
    int pop2()
    {
        if(top2 == stack.length){
            return -1;
        }   
        int x = stack[top2++];
        return x;
    }
}
