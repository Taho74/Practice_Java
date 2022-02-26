package ru.geekbrains.qa.java2.lesson1.Practice10;

public class Test {
    public static void main(String[] args) {
        for(int i = 1; i < 10; i++) {
            if(i == 5 || i == 6) {
                continue;
            }
            if(i > 7) {
                break;
            }
            System.out.println(i);
        }
    }
}
