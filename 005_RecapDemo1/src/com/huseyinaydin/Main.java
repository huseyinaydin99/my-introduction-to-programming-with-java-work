package com.huseyinaydin;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        int s1 = 15;
        int s2 = 20;
        int s3 = 2;
        int enBuyukSayi = 0;
        List<Integer> integers = new ArrayList<>();
        integers.add(s1);
        integers.add(s2);
        integers.add(s3);
        integers.stream().forEach(new Consumer<Integer>() {
            int enBuyukSayi = 0;
            int index = 0;
            @Override
            public void accept(Integer i) {
                if (i > enBuyukSayi)
                    enBuyukSayi = i;
                index++;
                if(index == 3)
                    System.out.println("en büyük sayı budur: " + enBuyukSayi);
            }
        });
    }
}
