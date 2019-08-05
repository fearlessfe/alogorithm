package Chapter1.two;

import java.util.Stack;

public class ReverseStack {
    private Stack<Integer> stack;

    public ReverseStack(Stack<Integer> stack){
        this.stack = stack;
    }

    public static int getAndRemoveLastElement(Stack<Integer> stack){
        int result = stack.pop();
        if(stack.empty()){
            return result;
        } else {
            int last = getAndRemoveLastElement(stack);
            stack.push(result);
            return last;
        }
    }

    public static void reverse(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }

    }
}
