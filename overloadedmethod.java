package ru.geekbrains.qa.java2.lesson1.Practice3;

public class overloadedmethod {


    int sum() {
        int result = 0;
        return result;
    }

    int sum(int a) {
        int result = 0 + a;
        return result;
    }

    int sum(int a, int b) {
        int result = a + b;
        return result;
    }

    int sum(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }

    int sum(int a, int b, int c, int d) {
        int result = a + b + c + d;
        return result;
    }

}

class overtest {
    public static void main(String[] args) {
        overloadedmethod overmet = new overloadedmethod();
        int sum1 = overmet.sum(1);
        System.out.println(sum1);
        int sum2 = overmet.sum(1, 2);
        System.out.println(sum2);
        int sum3 = overmet.sum(1, 4, 6);
        System.out.println(sum3);
        int sum4 = overmet.sum(1, 4, 6, 7);
        System.out.println(sum4);

    }
}