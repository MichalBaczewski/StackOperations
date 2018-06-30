package com.michalbaczewski.main;

public interface Stack<T> {

    void push(T element);
    T pop();
    T peek();
    boolean isEmpty();

}