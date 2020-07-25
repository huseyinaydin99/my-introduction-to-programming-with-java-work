package com.huseyinaydin;

public class Validator {
    public <T extends IEntity> void validate(T t){
        System.out.println("Geçerli " + t);
    }
}
