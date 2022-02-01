package ru.geekbrains.qa.java2.lesson1.Practice3;

public class overloadedmethod {


    int sum() {
        int result = 0;
        System.out.println(result);
        return result;
    }

    int sum(int a) {
        int result = 0 + a;
        System.out.println(result);
        return result;
    }

    int sum(int a, int b) {
        int result = a + b;
        System.out.println(result);
        return result;
    }

    int sum(int a, int b, int c) {
        int result = a + b + c;
        System.out.println(result);
        return result;
    }

    int sum(int a, int b, int c, int d) {
        int result = a + b + c + d;
        System.out.println(result);
        return result;
    }

}

class overtest {
    public static void main(String[] args) {
        overloadedmethod overmet = new overloadedmethod();
        overmet.sum(1);
        overmet.sum(1, 5);
        overmet.sum(1, 5, 6);
        overmet.sum(1, 5, 6, 9);

    }
}