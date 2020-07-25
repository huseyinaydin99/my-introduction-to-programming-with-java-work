package com.huseyinaydin;

public class ProductValidator {
    static {
        System.out.println("çalıştı 1");
    }
    static {
        System.out.println("çalıştı 2");
    }
    static {
        System.out.println("çalıştı 3");
    }
    public static boolean isValid(Product product){
        if (product.getPrice() > 0 && !product.getName().isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}
