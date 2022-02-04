package ru.geekbrains.qa.java2.lesson1.Practice4;

public class numbers {

    static int increaseNumbers (int a, int b, int c) {
        int result = a * b * c;
        System.out.println(result);
        return result;
    }

    static void divideNumbers (int a, int b) {
        int result = a / b;
        System.out.println(result);
    }

}

class numbersTest {
    public static void main(String[] args) {
        numbers.increaseNumbers(1,4,5);
        numbers.divideNumbers(10, 2);
        numbers.increaseNumbers(4,6,4);
        numbers.divideNumbers(100, 2);
    }
}