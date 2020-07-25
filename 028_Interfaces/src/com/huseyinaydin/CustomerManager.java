package com.huseyinaydin;

public class CustomerManager {
    private ICustomerDal iCustomerDal;

    public CustomerManager(ICustomerDal iCustomerDal) {
        this.iCustomerDal = iCustomerDal;
    }

    public void add(){
        //iş kodları burada yazılır
        this.iCustomerDal.add();
    }
}
