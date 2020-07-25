package com.huseyinaydin;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    String[] ogrenciler = new String[4];
	    ogrenciler[0] = "Ali";
	    ogrenciler[1] = "Veli";
	    ogrenciler[2] = "Deli";
	    ogrenciler[3] = "49 50";

        Arrays.stream(ogrenciler).forEach(i-> System.out.println(i));
    }
}
