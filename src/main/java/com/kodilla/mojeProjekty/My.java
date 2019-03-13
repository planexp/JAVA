package com.kodilla.mojeProjekty;

public class Zadanie1 {
    public static void main(String[] args) {
        for (int i = 20; i > 9; i--) {

            System.out.print(i+ ",");
        }
    }
}
public class Zadanie 2 {
public static void main(String[] args) {
        int i = 9;
        while(i<20){
        i++;
        System.out.print(i+ ",");
        }
        }
        }

public class Zadanie 3 {
public static void main(String[] args) {

        for (int i = -10; i < 41 ; i++) {
        if (i%2 ==0) {

        }else {
        System.out.print(i + ",");
        }

        }

        }
        }

public class Zadanie 4 {
public static void main(String[] args) {
        int i = -10;
        while (i<40){
        i++;
        if (i%2 == 0) {
        }else {
        System.out.print(i+",");
        //for (int i = -10; i < 41 ; i++) {
        //  if (i == 2) {
        }
        }
        }
        }

public class Zadanie5 {
    public static void main(String[] args) {
        int [] zmienna = {2,4,6,8,10};
        int sum = 0;
        for (int moja: zmienna) {
            sum += moja;
        }
        System.out.println(sum);
    }
}
public class Zadanie6  {
    public static void main(String[] args) {
        int [][] zmienna = {{2,4,6,8,10,12}, {2,4,6,8,10,12}};
        int sum = 0;
        for (int[] moja: zmienna) {
            for (int zmiennaa: moja)
                sum += zmiennaa;
        }
        System.out.println(sum);
    }
}

