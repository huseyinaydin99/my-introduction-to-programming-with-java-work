package com.huseyinaydin;

public class Main {

    public static void main(String[] args) {
        //camelcasing
	    int ogrenciSayisi = 10; //ilk harf küçük sonraki kelimenin ilk harfi büyük olur buna camelcasing denir
        //reuseability tekrar tekrar kullanılabilirlik
        String mesaj = "Öğrenci sayısı: ";
        System.out.println(mesaj + ogrenciSayisi);
    }
}
