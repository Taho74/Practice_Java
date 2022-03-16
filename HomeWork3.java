package ru.geekbrains.qa.java2.lesson1.GBLesson3;

import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {
        changeArray();
        fillArrays();
        fillArraysTwo();
        System.out.println(Arrays.toString(fillArraysThree(3,5)));
    }



    public static void changeArray () {
        int [] arr = {1,1,0,0,1,0,1,1,0,0};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1){
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    static void fillArrays() {
        int [] arr = new int[100];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));

    }


    static void fillArraysTwo() {
        int [] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] > 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    static int[] fillArraysThree(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++){
            arr[i] = initialValue;
        }
        return arr;

    }


}
