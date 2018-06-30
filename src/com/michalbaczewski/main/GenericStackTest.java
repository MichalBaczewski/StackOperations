package com.michalbaczewski.main;

public class GenericStackTest {
    public static void main(String[] args) {
        GenericStack<String> stack = new GenericStack(4);
        System.out.println("Is empty: " + stack.isEmpty());
        stack.push("Element nr 1");
        System.out.println("Is empty: " + stack.isEmpty());
        System.out.println("Peak: " + stack.peek());
        stack.push("Element nr 2");
        stack.push("Element nr 3");
        System.out.println("Peak: " + stack.peek());
        stack.push("Element nr 4");
        stack.push("Element nr 5");
        System.out.println("Peak: " + stack.peek());
        stack.pop();
        System.out.println("Peak: " + stack.peek());
    }
}
