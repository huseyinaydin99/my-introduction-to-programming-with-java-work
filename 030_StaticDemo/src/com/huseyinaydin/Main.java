package com.huseyinaydin;

public class Main {

    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product product = new Product(1,"Mouse",50);
        productManager.add(product);

        DatabaseHelper.Connection.createConnection();
        DatabaseHelper.Crud.delete();
    }
}
