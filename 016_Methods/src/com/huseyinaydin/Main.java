package com.huseyinaydin;

public class Main {

    public static void main(String[] args) {
        byte[] sayilar = new byte[]{1,2,5,7,9,0};
        byte arananSayi = 5;

        if (sayiBul(sayilar,arananSayi)) {
            System.out.println("Sayı bulundu ve bitti");
        }
        else
            System.out.println("Sayı bulunamadı ve bitti");
    }

    public static boolean sayiBul(byte[] sayilar,int arananSayi){
        boolean bulmaDurumu = false;
        byte bulunanIndex = 0;
        for (byte i = 0; i < sayilar.length; i++){
            if (sayilar[i] == arananSayi){
                bulmaDurumu = true;
                bulunanIndex = i;
                break;
            }
        }
        if (bulmaDurumu) {
            System.out.println("bulunan index: " + bulunanIndex);
            System.out.println("bulunan sayı : " + sayilar[bulunanIndex]);
        }
        return bulmaDurumu;
    }
}
