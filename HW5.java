package ru.geekbrains.qa.java2.lesson1.GBLesson5;


import java.util.ArrayList;

public class HW5 {
    public static void main(String[] args) {
        //Employee s1 = new Employee("Вася Пупкин", "QA", "123@mail.ru", "1234", 15000, 25);
        //System.out.println(s1);
        //System.out.println(s1.getAge());


        Employee[] emplArray = new Employee[5];
        emplArray[0] = new Employee("Петя", "QA", "55555@mail.ru", "423525", 5000, 30);
        emplArray[1] = new Employee("Гена", "Dev", "3333@mail.ru", "3333", 215000, 45);
        emplArray[2] = new Employee("Иван", "QA", "12234233@mail.ru", "18786784", 15000, 25);
        emplArray[3] = new Employee("Дмитрий", "PM", "12636373@mail.ru", "1756756", 15000, 23);
        emplArray[4] = new Employee("Вася", "Manager", "1445553@mail.ru", "1675433224", 145000, 35);

        for (Employee employee : emplArray) {
            if (employee.getAge() > 40) {
                System.out.println(employee);
            }
        }


    }
}

class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;


    Employee (String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }


    public int getAge() {
        return age;
    }

    @Override
    public String toString () {
        return "ФИО сотрудника: " + name + " должность: " + position + " почта: " + email + " тел: " + phone + " зарплата: " + salary + " возраст: " + age;
    }



}
