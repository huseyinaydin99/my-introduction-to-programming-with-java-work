package com.huseyinaydin;

public class Main {

    public static void main(String[] args) {
	    AccountManager accountManager = new AccountManager();
	    accountManager.deposit(100);
        System.out.println("Hesaptaki toplam para " + accountManager.getBalance());
        try {
            accountManager.withdraw(90);
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Hesaptaki toplam para " + accountManager.getBalance());
        }
        System.out.println("Hesaptaki toplam para " + accountManager.getBalance());
        try {
            accountManager.withdraw(20);
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Hesaptaki toplam para " + accountManager.getBalance());
        }
    }
}
