package com.huseyinaydin;

public class Main {

    public static void main(String[] args) {
        char grade = 'A';
        switch (grade){
            case 'A':
                System.out.println("Mükemmel not");
                break;
            case 'B':
            case 'C':
                System.out.println("İyi not");
                break;
            case 'D':
                System.out.println("Fena değil");
                break;
            case 'E':
                System.out.println("Kötü ama geçer");
                break;
            default:
                System.out.println("Geçersiz not girdiniz");
                break;
        }
    }
}
