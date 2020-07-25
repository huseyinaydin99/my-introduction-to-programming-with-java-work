package com.huseyinaydin;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(10);
        arrayList.add("Niğde");
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(1));

        System.out.println("---------------");
        
        for (Object o:arrayList) {
            System.out.println(o);
        }
        arrayList.clear();
    }
}
