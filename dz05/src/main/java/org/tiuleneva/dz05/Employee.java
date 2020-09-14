package org.tiuleneva.dz05;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee (String name, String position, String email, String phoneNumber, int salary, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo () {
        System.out.println("Name: " + name);
        System.out.println("Position: " + position);
        System.out.println("Email: " + email);
        System.out.println("PhoneNumber: " + phoneNumber);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
    }

    public int getAge() {
        return age;
    }
}

