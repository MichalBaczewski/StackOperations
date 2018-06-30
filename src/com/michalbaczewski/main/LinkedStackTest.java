package com.michalbaczewski.main;

public class LinkedStackTest {
    public static void main(String[] args) {
        LinkedStack<String> linkedStack = new LinkedStack<>();
        System.out.println("isEmpty: " + linkedStack.isEmpty());
        linkedStack.push("Element nr 1");
        System.out.println("Peak: " + linkedStack.peek());
        linkedStack.push("Element nr 2");
        linkedStack.push("Element nr 3");
        System.out.println("isEmpty: " + linkedStack.isEmpty());
        linkedStack.pop();
        System.out.println("Peak: " + linkedStack.peek());
    }
}
