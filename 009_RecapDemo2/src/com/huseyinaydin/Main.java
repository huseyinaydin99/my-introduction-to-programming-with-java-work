package com.huseyinaydin;

public class Main {

    public static void main(String[] args) {
        double[] myList = {5.11,7.64,11.23,44.17};
        double total = 0;
        double max = 0;
        for (double number : myList) {
            if (number>max)
                max = number;
            total += number;
        }
        System.out.println("En büyük sayı " + max + " total " + total);
    }
}
