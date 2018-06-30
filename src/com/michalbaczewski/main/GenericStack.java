package com.michalbaczewski.main;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class GenericStack<T> {

    private T element;
    private List<T> stackList;
    private T top;
    private Integer size;
    private Integer maxSize;

    public GenericStack(Integer size) {
        stackList = new ArrayList<T>();
        this.size = 0;
        maxSize = size;
    }

    public void push(T element) {
        if (size != maxSize) {
            stackList.add(element);
            top = element;
            size++;
        } else {
            System.out.println("Stos został zapełniony! Nie można dodać kolejnego elementu");
        }
    }

    public T peek() {
        if (!isEmpty()) {
            return top;
        } else {
            throw new EmptyStackException();
        }
    }

    public T pop() {
        if (!isEmpty()) {
            size--;
            if (size == 0) {
                top = null;
                return stackList.get(size);
            }
            top = stackList.get(size - 1);
            return stackList.get(size);
        } else {
            throw new EmptyStackException();
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }
}