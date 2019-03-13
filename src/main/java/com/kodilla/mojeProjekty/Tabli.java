package com.kodilla.mojeProjekty;
/*Napisz program, który spośród tablicy liczb całkowitych wybierze takie pary następujących po sobie liczb,
dla których suma jest najmniejsza lub największa. W przypadku, gdy istnieje kilka par, dla których suma jest
najmniejsza lub największa, to użytkownik powinien zobaczyć je wszystkie. Jeżeli jakaś para liczb się powtarza,
to powinna być uwzględniona tylko raz. Tablicę liczb przekaż jako argument wywołania programu.

Przykład
wejście: [1, 2, 4, 6, 7]
wyjście: Najmniejsza para [1, 2], największa para [6, 7]*/

import java.util.*;

public class Tabli {
    public static void main(String[] args) {

        int[] numbers = {12, 14, 2, 5, 1, 21};

        int min = numbers[0];
        int max = numbers[0];

        int min2 = numbers[0];
        int max2 = numbers[0];

        for(int x : numbers ){
            if (x < min) {
                min = x;
            }
            if (x > max) {
                max = x;
            }
        }
        int min1= numbers[0];
        int max1 = numbers[0];

        for (int x: numbers){
            if (x<min1 && x!=min){
                min1 = x;
            }
            if (x>max2 && x!=max){
                max1=x;
            }
        }
        System.out.println("Para licza min: "+min+","+min1);
        System.out.println("Para licza max: "+max+","+max1);
    }
}

/*

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            int one = numbers[i];

            for (int j = i + 1; j < numbers.length; j++) {
                int second = numbers[j];
                if ((one + second) == sum) {
                    System.out.print(numbers[0] + numbers[1]);
                    System.out.println("=("+ one +","+ second+")");

                    System.out.print(numbers[1]+numbers[2]);
                    System.out.println("=("+ numbers[1] +","+ numbers[2]+")");

                    System.out.print(numbers[2]+numbers[3]);
                    System.out.println("=("+ numbers[2] +","+ numbers[3]+")");

                    System.out.print(numbers[3]+numbers[4]);
                    System.out.println("=("+ numbers[3] +","+ numbers[4]+")");

                    System.out.print(numbers[4]+numbers[5]);
                    System.out.println("=("+ numbers[4] +","+ numbers[5]+")");
        for (int i = 0; i < array.length; i++) {
        int first = array[i];
        for (int j = i + 1; j < array.length; j++) {
        int second = array[j];

        if ((first + second) == sum) {
        System.out.printf("(%d, %d) %n", first, second);
        }
        }

        }
        }

*/


        //Scanner sc = new Scanner(System.in);

        /*
         int count = 0;// Initialize result

        // Consider all possible pairs and check their sums
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if ((arr[i] + arr[j]) == sum)
                    count++;

        System.out.printf("Count of pairs is %d",count);

        List<Integer> num = Arrays.asList(1, 2, 3);

        int sum = num[0] + num[1];

          int sum0 = numbers[0] + numbers[1];
        System.out.println(sum0);

        int sum1 = numbers[1] + numbers[2];
        System.out.println(sum1);

        int sum2 = numbers[2] + numbers[3];
        System.out.println(sum2);

        int sum3 = numbers[3] + numbers[4];
        System.out.println(sum3);

        int sum4 = numbers[4] + numbers[5];
        System.out.println(+ sum4);

        Collections.sort(num);
        System.out.println(num);

    }
}*/

