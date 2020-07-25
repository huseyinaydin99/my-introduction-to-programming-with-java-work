package com.huseyinaydin;

public class CustomerManager {
    private BaseDatabaseManager baseDatabaseManager;

    public CustomerManager(BaseDatabaseManager baseDatabaseManager) {
        this.baseDatabaseManager = baseDatabaseManager;
    }

    public void getCustomer(){
        this.baseDatabaseManager.getData();
    }
}
