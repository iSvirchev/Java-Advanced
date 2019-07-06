package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomList<E extends Comparable<E>> {
    private List<E> data;

    public CustomList() {
        this.data = new ArrayList<>();
    }

    public void add(E element) {
        data.add(element);
    }

    public E remove(int index) {
       return this.data.remove(index);
    }

    public void contains(E element) {
        System.out.println(data.contains(element));
    }

    public void swap(int firstIndex, int secondIndex){

        Collections.swap(this.data,firstIndex,secondIndex);
    }

    public int countGreaterThan(E element){
        return (int)this.data
                .stream()
                .filter(value -> value.compareTo(element) > 0)
                .count();
    }

    public E getMax (){
        return Collections.max(this.data);
    }

    public E getMin(){
        return Collections.min(this.data);
    }

    public void printList (){
        for (E elem : data) {
            System.out.println(elem);
        }
    }


}
