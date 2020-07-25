package com.huseyinaydin;

public class Main {

    public static void main(String[] args) {
	    Product product = new Product();
	    Product product1 = new Product(2,"Macbook Pro","Falan felan inter milan",12000,(byte)5);
	    product.setId(1);
	    product.setName("Asus Laptop");
	    product.setDescription("Abcdef");
	    product.setPrice(5000);
	    product.setStockAmount((byte)6);
	    ProductManager productManager = new ProductManager();
	    productManager.add(product);
	    productManager.add(product1);
    }
}
