package com.huseyinaydin;
import matematik.DortIslem;

import java.util.Scanner; //buna build-in denir. yani javının kendi içinde var olan paketlerdir.
public class Main {

    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();
        int toplam = dortIslem.topla(10,5);
        System.out.println(toplam);
    }
}
