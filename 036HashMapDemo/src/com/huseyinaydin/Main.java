package com.huseyinaydin;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String,String> sozluk = new HashMap<>();
        sozluk.put("book","kitap");
        sozluk.put("car","araba");
        sozluk.put("pencil","kalem");
        System.out.println(sozluk.size());
        for (String item : sozluk.keySet()){
            System.out.println("Eleman " + item + " Değer " + sozluk.get(item));
        }
        sozluk.remove("car");
        sozluk.clear();
    }
}
