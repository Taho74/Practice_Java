package ru.geekbrains.qa.java2.lesson1.Practice2;

public class Human {
    String name1;
    Car car1;
    BankAccount bankAccount1;

    void info () {
    System.out.println("Имя: " + name1 + " автомобиль: "+ car1 + " банковский счет: " + bankAccount1);
    }


}

class HumanTest {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.name1 = "Иван";
        human1.car1 = new Car("Kia", "V4");
        human1.bankAccount1 = new BankAccount(123, 16.23);
        human1.info();
        double plus = human1.bankAccount1.addBalance(4.0);
        System.out.println("Баланс: " + plus);
        double get = human1.bankAccount1.getBalance(5.0);
        System.out.println("Баланс: " + get);

    }
}

class Car {
    String name;
    String engine;

    Car (String name, String engine) {
        this.name = name;
        this.engine = engine;
    }

    @Override
    public String toString (){
        return name + " " + engine;
    }
}

class BankAccount {
    int id;
    double balance;

    BankAccount(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    double addBalance(double a) {
        balance += a;
        return balance;
    }

    double getBalance(double a) {
        balance -= a;
        return balance;
    }

    @Override
    public String toString (){
        return id + " " + balance;
    }

}