package com.huseyinaydin;

public class MyList<T> {
    public void add(T object){
        System.out.println("eklendi " + object);
    }

    public void remove(T object){
        System.out.println("Silindi " + object);
    }
}
