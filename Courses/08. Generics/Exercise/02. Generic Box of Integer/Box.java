package com.company;

public class Box<T> {
    private T element;

    public Box(T type){
        this.element = type;
    }

    @Override
    public String toString() {
        return this.element.getClass().getName() + ": "  + this.element;
    }
}
