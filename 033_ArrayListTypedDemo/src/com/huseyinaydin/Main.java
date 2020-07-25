package com.huseyinaydin;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> sehirler = new ArrayList<>();
        sehirler.add("Niğde");
        sehirler.add("Zonguldak");
        sehirler.add("Ankara");
        sehirler.add("Hakkari");
        System.out.println(sehirler.size());
        Collections.sort(sehirler);
        for (String sehir: sehirler){
            System.out.println(sehir);
        }
        sehirler.clear();
    }
}
