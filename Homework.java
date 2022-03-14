package ru.geekbrains.qa.java2.lesson1.GBLesson2;

public class Homework {
    public static void main(String[] args) {
        System.out.println(getNumber(4, 5));
        getNumber2(-5);
        System.out.println(getNumber3(-5));
        getNumber4("333", 5);
    }


    static boolean getNumber (int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    static void getNumber2 (int a) {
        if (a >= 0){
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }


    static boolean getNumber3 (int a){
        return a >= 0;
    }

    static void getNumber4 (String word, int a) {
        for (int i = 0; i < a; i++){
            System.out.println(word);
        }
    }


    
}

