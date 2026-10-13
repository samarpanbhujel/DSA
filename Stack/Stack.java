
package Stack;

public class Stack {
    int stack[] = new int[5];
    int top = -1;

    public void push(int data) {
        if (top == stack.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        top++;
        stack[top] = data;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }

        int data = stack[top];
        stack[top] = 0;
        top--;

        return data;
    }

    public void show() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i]);
        }
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }

        return stack[top];
    }
}
