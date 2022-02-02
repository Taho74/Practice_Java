package ru.geekbrains.qa.java2.lesson1.Practice2;

public class Employee2 {
    public static void main(String[] args) {
        Employee human1 = new Employee(1, "Ivanov", 34);
        Employee human2 = new Employee(1, "Ivanov", 30, 150, "Devops");

        System.out.println(human2);
        System.out.println(human1);
    }
}
