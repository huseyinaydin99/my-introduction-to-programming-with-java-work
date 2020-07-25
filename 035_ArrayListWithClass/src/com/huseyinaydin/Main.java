package com.huseyinaydin;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        Customer customer = new Customer(1, "Hüseyin", "Aydın");
        customers.add(customer);
        customers.add(new Customer(2, "Abc", "Abc"));
        customers.remove(customer);
        customers.stream().forEach(i-> System.out.println(i));
    }
}
