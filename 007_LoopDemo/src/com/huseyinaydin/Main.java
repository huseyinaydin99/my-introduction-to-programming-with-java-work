package com.huseyinaydin;

public class Main {

    public static void main(String[] args) {
	    for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        System.out.println("For döngüsü bitti");
	    int i = 0;
	    while (i < 10){ //infinite loop(sonsuz döngü) denir.
            System.out.println(i);
        }
        System.out.println("Sonsuz while döngüsü bitti");
        int j = 0;
        while (j < 10){
            System.out.println(j);
            i++;
        }
        System.out.println("Sonlu while döngüsü bitti");
        int k = 0;
        do{
            System.out.println(k);
            k++;
        }
        while (k < 10);
        System.out.println("Do while döngüsü bitti");
    }
}
