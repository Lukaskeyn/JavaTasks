package com.lukaskeyn;

import java.util.Arrays;

public class SecondLesson {
    //Task1
    public static void printArray(int[] array){
        System.out.println(Arrays.toString(array));
    }
    //Task2
    public static void printElementsFirstChar(String[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i].charAt(0) + " " );
        }
    }
    //Task3
    public static int sumFirstLastNumber(int number){
         int last;
        if (Math.abs(number) >=10) {
           last = number % 10;
                  }
       else {
           last = 0;
       }
        while(Math.abs(number) > 1) {

            number = number/10;
        }
      int  sum = last + number;
        return Math.abs(sum);
    }
    //Task4
    public static long findFactorial(byte number){
        long factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
    //Task5
    public static double findAverage(int[] array) {
     double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum/array.length;
    }
}
