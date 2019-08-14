package algorithm;

import java.util.EmptyStackException;

public class Stack<T> {
    class Node<T> {
        private T data;
        private Node<T> next;

        Node(T data){
            this.data = data;
        }
    }

    private Node<T> top;

    public T pop() {
        if (top == null) {
            throw new EmptyStackException();
        }
        T item = top.data;
        top = top.next;
        return item;
    }

    public void push(T item){
        Node<T> data = new Node<T>(item);
        data.next = top;
        top = data;
    }

    public T peek() {
        if(top == null){
            throw new EmptyStackException();
        }
        return top.data;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.pop());
    }
}

