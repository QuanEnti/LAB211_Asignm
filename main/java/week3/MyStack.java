/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

/**
 *
 * @author HP
 */
public class MyStack {
    private int[] stackValues;
    private int top;
    private int capacity;

    public MyStack(int size) {
        capacity = size;
        stackValues = new int[capacity];
        top = -1;
    }

    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack is full. Cannot push " + value);
        } else {
            stackValues[++top] = value;
            System.out.println(value + " pushed to stack.");
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        } else {
            int value = stackValues[top--];
            System.out.println(value + " popped from stack.");
            return value;
        }
    }

    public int get() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        } else {
            System.out.println("Top of stack: " + stackValues[top]);
            return stackValues[top];
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
