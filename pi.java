package ru.geekbrains.qa.java2.lesson1.Practice4;

public class pi {
    static final double p = 3.14;

    void squareСal (double radius) {
        double squareСircle = p * radius * radius;
        System.out.println(squareСircle);
    }

    static void  lengthcСircumference (double radius) {
        double lengthC = 2 * p * radius;
        System.out.println(lengthC);
    }

    void info (double radius) {
        double squareСircle = p * radius * radius;
        double lengthC = 2 * p * radius;
        System.out.println("Радиус: " + radius + " площадь круга: " + squareСircle + " длина окружности: " + lengthC);
    }

}

class pitest {
    public static void main(String[] args) {
        pi.lengthcСircumference(5);
        pi p1 = new pi();
        p1.squareСal(7);
        p1.info(5);

    }
}
