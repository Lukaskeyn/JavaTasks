package org.example;

import java.util.Arrays;

public class FirstLesson {
    //Task_7
    public static int firstNumber (int x) {
        while(Math.abs(x) >= 10) {
            x = x / 10;
        }
        return Math.abs(x);
    }
    //Task_8
    public static int lastNumber (int x) {
        while(Math.abs(x) >= 10) {
            x = x % 10;
        }
        return Math.abs(x);
    }
    //Task_9
    public static void sumFirstLast(int a) {
        int sum = firstNumber(a) + lastNumber(a);
        System.out.println(sum);
    }
    //Task_10
    public static int countNumbers(int x) {
        int count = 1;
        while(Math.abs(x) >= 10) {
            x = x / 10;
            count++;
        }
        return count;
    }
    //Task_11
    public static boolean isEqual(int x, int y) {
        boolean isEqual;
        if(firstNumber(x) == firstNumber(y) ) {
            isEqual = true;
        }
        else  isEqual = false;
        return isEqual;
    }
    //Task_12
    public static void printNumbers(int[] x){
        for (int i = 0; i < x.length; i++) {
            if(x[i] >= 1 && x[i] <= 100) {
                System.out.println(x[i]);
            }
        }
    }
    //Task_1
    public static void isNegative(int x) {
        if (x < 0) {
            System.out.println("Число отрицательное!");
        }
        else  System.out.println("Число положительное!");
    }
    //Task_2
    public static int findStringLength(String s) {
        int length = s.length();
        return length;
    }
    //Task_3
    public static char findLastChar(String s){
        char lastChar = s.charAt(s.length() - 1);
        return lastChar;
    }
    //Task_4
    public  static boolean isEven(int x){
        boolean isEven;
        if(x  % 2 == 0) {
            isEven = true;
        }
        else  isEven = false;
    return isEven;
    }
    //Task_5
    public static boolean firstCharIsEqual(String a, String b) {
        boolean isEqual;
        if(a.charAt(0) == b.charAt(0)) {
            isEqual = true;
        }
        else isEqual = false;
        return isEqual;
    }
    //Task_6
    public  static char findLastCharModify(String s){
     char c  = findLastChar(s);
     if(c == 'ь') {
         c = s.charAt(s.length() - 2);
     }
     return c;
    }
    //Task_13
    public static void longString(String s){
        if(s.length() > 1){
            System.out.println(s.charAt(s.length()-2));
        }
    }
    //Task_14
    public static int div(int a, int b) {
        return (a % b);
    }
    //Task_15
    public static void seasons(int x){
        switch (x){
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("ERROR");
                break;
        }
    }
    //Task_16
    public static void printEven(int[] a){
        for (int i = 0; i < a.length; i++) {
            if(a[i] % 2 == 0) {
                System.out.println(a[i]);
            }
        }
    }
    //Task_17
    public static void printCharReverse(String s){
        for (int i = s.length()-1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
    }
    //Task_18
    public static void printQuarterOfHour(int c) {
    if(c >= 0 && c <= 15) {
        System.out.println("1");
    }
    else if(c > 15 && c <= 30){
        System.out.println("2");
    }
    else if(c > 30 && c <= 45){
        System.out.println("2");
    }
    else
        System.out.println("4");
    }
    //Task_19
    public static void printDivByThree(int[] a){
        for (int i = 0; i < a.length; i++) {
            if(a[i] % 3 == 0) {
                System.out.print(a[i] + " ");
            }
        }
    }
    //Task_20
    public static boolean isDivWithout(int first, int second){
        boolean isDivWithout;
        if(first % second == 0) {
            isDivWithout = true;
        }
        else isDivWithout = false;
        return isDivWithout;
    }
    //Task_21
    public static String concat(char a, char b, char c){
        StringBuilder builder = new StringBuilder();
        return builder.append(a).append(b).append(c).toString();
    }
    //Task_22
    public static long conversionKbIntoByte(long kb){
    return  kb*1024L;
    }
    //Task_23
    public static int sum(int[] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
    //Task_24
    public static int sumChars(char a, char b, char c) {
        int sum = a + b + c;
        return sumNumber(sum);
    }
    //Task_25
public static long conversionMbIntoByte(long mb){
       long kbyte = mb * 1024L;
        return conversionKbIntoByte(kbyte) ;
}


    //Task_26
    public static int sumOddNumbers(int[] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if( a[i] % 2 != 0)
            sum += a[i];
        }
        return sum;
    }
    //Task_27
     public static void printDegreeN(int n, int a) {
        int count = 0;
         int degree = 1;
        while( count <= n) {

            if ( count != 0)  {
               degree  *=  a;
                System.out.println(degree);
            }
            else  {
                System.out.println(1);
            }
            count++;
        }
     }
    //Task_28
     public static int sumString(String a, String b, String c){
        int sum = Integer.parseInt(a) +Integer.parseInt(b) +Integer.parseInt(c);
        return sum;
     }
    //Task_29
     public static int reverseNumber(int x){
        StringBuilder builder = new StringBuilder();
         while(Math.abs(x) >= 10) {
             builder.append(x%10);
             x = x / 10;
         }
         builder.append(x);
        return  Integer.parseInt(builder.toString());
     }
    //Task_30
     public static int sumNumber(int x){
        int sum = 0;
         while(Math.abs(x) >= 10) {
             sum += x %10;
             x = x / 10;
         }
         sum +=x;
         return sum;
     }
    //Task_31
    public static void conversionGbIntoMBAndKbAndByte(float gb) {
     long bytes =0;
     long mb = 0;
     long kb = 0;
    String[] array = String.valueOf(gb).split("\\.");
      mb = Integer.parseInt(array[0]) * 1024L;
      double div = (Double.parseDouble(array[1]) / 100) * 1024;
      mb += div;
        System.out.println( mb + "- Мегабайт");
        kb = mb * 1024;
        System.out.println(kb + "- Килобайт");
     bytes = conversionKbIntoByte(kb);
        System.out.println(bytes + "- Байт");

    }
    //Task_32
 public static void printArrayReverse(int[] array){
     for (int i = array.length - 1; i >= 0; i--) {
         System.out.print(array[i] + " ");
     }
 }
    //Task_33
    public static void conversionByteIntoGbAndMbAndKb(long bytes) {
        double kb = bytes/1024d;
        System.out.printf( "%.2f",kb  );
        System.out.println( "- Килобайт");
        double mb = kb / 1024d;
        System.out.printf("%.2f",mb);
        System.out.println( "- Мегабайт");
        double gb = mb / 1024d;
        System.out.printf("%.2f", gb);
        System.out.println( "- Гигабайт");
    }
    //Task_34
    public static boolean lastCharFirstIsEqualFirstCharSecond(String first, String second) {
        boolean isEqual;

        if(first.toLowerCase().charAt(first.length() - 1) == second.toLowerCase().charAt(0)) {
            isEqual = true;
        }
        else isEqual = false;
        return isEqual;
    }
    //Task_35
    public static void printSecondsInDay(){
        int hours = 24;
        int minutes = hours * 60;
        int seconds = minutes * 60;
        System.out.println(seconds);
    }
    //Task_36
    public static void printNegativeNumbers(int[] x){
        for (int i = 0; i < x.length; i++) {
            if(x[i] >= -100 && x[i] <= 0) {
                System.out.print(x[i] + " ");
            }
        }
    }
    //Task_37
    public static void printSecondsInYear(){
        int days = 365;
        int hours = days * 24;
        int minutes = hours * 60;
        int seconds = minutes * 60;
        System.out.println(seconds);
    }
    //Task_38
    public static void findDividers(int x){
        for (int i = 1; i <= x; i++) {
            if( x % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
    //Task_39
    public static void findIterations(int x){
        int count = 0;
        while( x >= 10) {
            x = x/ 2;
            count++;
        }
        System.out.println(count + " - число итераций");
    }
    }
