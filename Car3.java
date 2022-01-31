package ru.geekbrains.qa.java2.lesson1.Practice2;

public class Car3 {
    String color;
    String engine;
    int number;


    Car3 (String color, String engine) {
        this.color = color;
        this.engine = engine;

        System.out.println("Цвет машины: " + color + " мотор машины: " + engine);
    }

    Car3 (String color, String engine, int nubmer) {
        this.color = color;
        this.engine = engine;
        this.number = nubmer;

        System.out.println("Цвет машины: " + color + " мотор машины: " + engine + " номер автомобиля: " + nubmer);
    }
}

class carInfo {
    public static void main(String[] args) {
        Car3 car1 = new Car3("Red", "V8");
        Car3 car2 = new Car3("Black", "V6", 6);
    }
}
