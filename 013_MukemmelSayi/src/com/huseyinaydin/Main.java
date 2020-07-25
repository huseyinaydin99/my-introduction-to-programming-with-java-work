package com.huseyinaydin;

public class Main {

    public static void main(String[] args) {
	    int number = 28;
	    int total = 0;
	    for (int i = 1; i < number; i++){
	        if (number % 1 == 0){
	            total = total + i;
            }
        }
	    if (total == number)
            System.out.println("Mükemmel sayıdır");
	    else
            System.out.println("Mükemmel sayı değildir");
    }
}
