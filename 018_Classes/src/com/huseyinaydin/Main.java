package com.huseyinaydin;

public class Main {

    public static void main(String[] args) {
        //reference type
	    CustomerManager customerManager = new CustomerManager();
	    customerManager.add();
	    customerManager.remove();
	    customerManager.update();

	    int sayi1 = 10;
	    int sayi2 = 20;
	    sayi2 = sayi1;
	    sayi1 = 30;
        System.out.println(sayi2);

        int[] sayilar1 = new int[]{1,2,3};
        int[] sayilar2 = new int[]{4,5,6};
        sayilar2 = sayilar1;
        sayilar1[0] = 10;
        System.out.println(sayilar2[0]);
    }
}
