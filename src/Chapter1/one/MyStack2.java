package Chapter1.one;

import java.util.Stack;

public class MyStack2 {
    private Stack<Integer> dataStack;
    private Stack<Integer> minStack;

    public MyStack2() {
        this.dataStack = new Stack<>();
        this.minStack = new Stack<>();
    }

    public void push(int newNum) {
        if(this.minStack.isEmpty())
            this.minStack.push(newNum);
        else if(newNum >= this.getMin())
            this.minStack.push(this.getMin());
        else
            this.minStack.push(newNum);
        this.dataStack.push(newNum);
    }

    public int pop() {
        this.minStack.pop();
        return this.dataStack.pop();
    }

    public int getMin() {
        if (this.minStack.isEmpty())
            throw new RuntimeException("Stack is Empty");
        return this.minStack.peek();
    }
}
