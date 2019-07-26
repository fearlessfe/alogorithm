package Chapter1.one;

import java.util.Stack;

public class MyStack1 {
    private Stack<Integer> dataStack;
    private Stack<Integer> minStack;

    public MyStack1() {
        this.dataStack = new Stack<Integer>();
        this.minStack = new Stack<Integer>();
    }

    public void push(int newNum) {
        if(this.minStack.isEmpty()){
            this.minStack.push(newNum);
        } else if(newNum <= this.getMin()){
            this.minStack.push(newNum);
        }
        this.dataStack.push(newNum);
    }

    public int pop() {
        if (this.minStack.isEmpty())
            throw new RuntimeException("Stack is Empty");
        int ret = this.dataStack.pop();
        if(ret == this.getMin()){
            this.minStack.pop();
        }
        return ret;
    }

    public int getMin() {
        if (this.minStack.isEmpty())
            throw new RuntimeException("Stack is Empty");
        return this.minStack.peek();
    }

    public static void main(String[] args) {
        MyStack1 myStack1 = new MyStack1();
        myStack1.push(4);
        System.out.println(myStack1.getMin());
        myStack1.push(2);
        System.out.println(myStack1.getMin());
        myStack1.push(3);
        System.out.println(myStack1.getMin());
    }
}

