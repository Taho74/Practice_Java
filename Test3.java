package ru.geekbrains.qa.java2.lesson1.Practice10;

public class Test3 {
    public static void main(String[] args) {
        time();
    }



    static void time() {
        int hour = 0;

        OUTER: while (hour < 6){
            int minute = -1;
            MIDDLE: do {
                int second = 0;
                minute++;
                if(hour > 1 && minute %10 == 0) {
                    break OUTER;
                }
                INNER: while (second < 60) {
                    if(second * hour > minute) {
                        continue MIDDLE;
                    }
                    System.out.println(hour + " : " + minute + " : " + second);
                    second++;
                }
            } while (minute < 59);
            hour++;

        }
    }
}