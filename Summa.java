package ru.geekbrains.qa.java2.lesson1.Practice2;

public class Summa {

    int summa (int a, int b, int c) {
        int result = a + b + c;
        return result;
    }

    int calculateArithmeticMean (int a1, int b1, int c1) {
        int result2 = summa(a1, b1, c1) / 3;
        return result2;
    }
}

class Test1 {
    public static void main(String[] args) {
        Summa t = new Summa();
        int summaTree = t.summa(1, 2, 3);
        System.out.println(summaTree);
        System.out.println(t.summa(2, 2, 4));
        System.out.println(t.calculateArithmeticMean(20, 40, 60));
    }
}
