package ru.geekbrains.qa.java2.lesson1.Practice2;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;


    Employee(int id, String surname, int age, double salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    double addSalary () {
        salary *= 2;
        return salary;
    }

    @Override
    public String toString () {
        return id + " " + surname + " " + age + " " +  salary + " " + department;
    }

}

class EmployeeTest {
    public static void main(String[] args) {
        Employee human1 = new Employee(1, "Ivanov", 34, 150.00, "QA");
        Employee human2 = new Employee(2, "Petrov", 25, 100.00, "Developer");
        System.out.println(human1);
        System.out.println(human2);
        human1.addSalary();
        human2.addSalary();
        System.out.println(human1.salary);
        System.out.println(human2.salary);
    }
}
