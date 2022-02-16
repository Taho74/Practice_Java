package ru.geekbrains.qa.java2.lesson1.Practice6;

public class Car {
    String color;
    String engine;
    int doors;

    Car (String color, String engine, int doors) {
        this.color = color;
        this.engine = engine;
        this.doors = doors;
    }

    public int changeDoors (int d) {
        doors = d;
        return doors;
    }

    public static void changeColor (Car c1, Car c2) {
        Car c3 = c1;
        c1 = c2;
        c2 = c3;
    }

    @Override

    public String toString() {
        return "Цвет машины: " + color + " двигатель: " + engine + " кол-во дверей: " + doors;
    }
}

class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car("black", "V8", 5);
        System.out.println(c1);
        c1.changeDoors(2);
        System.out.println(c1);

        Car c2 = new Car("red", "V6", 3);

    }




}
