package com.huseyinaydin;

public class MySqlCustomerDal implements ICustomerDal {
    @Override
    public void add() {
        System.out.println("MySql eklendi");
    }
}
