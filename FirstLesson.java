package org.example;

public class FirstLesson {
    public static int firstNumber (int x) {
        while(Math.abs(x) >= 10) {
            x = x / 10;
        }
        return Math.abs(x);
    }
    public static int lastNumber (int x) {
        while(Math.abs(x) >= 10) {
            x = x % 10;
        }
        return Math.abs(x);
    }
    public static void sumFirstLast(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }
    public static int countNumbers(int x) {
        int count = 1;
        while(Math.abs(x) >= 10) {
            x = x / 10;
            count++;
        }
        return count;
    }
    public static boolean isEqual(int x, int y) {
        boolean isEqual;
        if(firstNumber(x) == firstNumber(y) ) {
            isEqual = true;
        }
        else  isEqual = false;
        return isEqual;
    }
    public static void printNumbers(int[] x){
        for (int i = 0; i < x.length; i++) {
            if(x[i] >= 1 && x[i] <= 100) {
                System.out.println(x[i]);
            }
        }
    }
    public static void isNegative(int x) {
        if (x < 0) {
            System.out.println("Число отрицательное!");
        }
        else  System.out.println("Число положительное!");
    }
    public static int findStringLength(String s) {
        int length = s.length();
        return length;
    }
    public static char findLastChar(String s){
        char lastChar = s.charAt(s.length() - 1);
        return lastChar;
    }
    public  static boolean isEven(int x){
        boolean isEven;
        if(x  % 2 == 0) {
            isEven = true;
        }
        else  isEven = false;
    return isEven;
    }
    public static boolean firstCharIsEqual(String a, String b) {
        boolean isEqual;
        if(a.charAt(0) == b.charAt(0)) {
            isEqual = true;
        }
        else isEqual = false;
        return isEqual;
    }
    public  static char findLastCharModify(String s){
     char c  = findLastChar(s);
     if(c == 'ь') {
         c = s.charAt(s.length() - 2);
     }
     return c;
    }
}
