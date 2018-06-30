package com.michalbaczewski.main;

import java.util.EmptyStackException;

public class LinkedStack<T> implements Stack<T> {

    private StackElement<T> top;
    private Integer size;

    public void push(T element) {
        top = new StackElement<>(element, top);
        size++;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T peek() {
        if (!isEmpty()) {
            return top.element;
        } else {
            throw new EmptyStackException();
        }
    }

    public T pop() {
        if (!isEmpty()) {
            size--;
            top = top.previousElement;
            return top.element;
        } else {
            throw new EmptyStackException();
        }
    }

    private class StackElement<T> {
        T element;
        StackElement<T> previousElement;

        public StackElement(T element, StackElement<T> previousElement) {
            this.element = element;
            this.previousElement = previousElement;
        }
    }
}
