package com.huseyinaydin;

public class Main {

    public static void main(String[] args) {
	    String sehir = sehirVer();
	    byte toplam = topla((byte)10,(byte)10);
        System.out.println(sehir);
        System.out.println(toplam);
        System.out.println(topla(10,20,30));
    }

    public static String sehirVer(){
        return "Niğde";
    }

    public static byte topla(byte sayi1, byte sayi2){
        return (byte) (sayi1 + sayi2);
    }

    public static int topla(int... arg0){
        int toplam = 0;
        for (int sayi : arg0) {
            toplam += sayi;
        }
        return toplam;
    }
}
