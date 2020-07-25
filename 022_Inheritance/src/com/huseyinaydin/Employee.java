package com.huseyinaydin;

public class Employee extends Person {
    private int salary;

    public Employee(int salary) {
        this.salary = salary;
    }

    public Employee(){

    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
