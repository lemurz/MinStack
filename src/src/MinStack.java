package src;
import java.util.EmptyStackException;
import java.util.Stack;

public class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack(){
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int value){
        stack.push(value);

        if(minStack.isEmpty() || value<=minStack.peek()){
            minStack.push(value);
        }
        else{
            minStack.push(minStack.peek());
        }
    }

    public void pop(){
        if(!stack.empty()){
            stack.pop();
            minStack.pop();
        }
        else{
            System.out.println("Nothing to show!");
        }
    }

    public int min(){
        if(!minStack.empty()){
            return minStack.peek();
        }
        throw new EmptyStackException();
    }

    public static void main(String[] args){
        MinStack minStack1 = new MinStack();

        minStack1.push(5);
        minStack1.push(4);
        minStack1.push(2);
        minStack1.pop();
        minStack1.min();
    }
}
