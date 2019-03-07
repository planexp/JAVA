package com.kodilla.mojeProjekty;

import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        int tem= 0;

        Scanner moj = new Scanner(System.in);

        System.out.println("Podaj temperature");

       tem = moj.nextInt();
        if (tem >=1) {
            System.out.println(" Temp. dodatnia");
        }else  if (tem == 0){
            System.out.println("Temp. jest równa 0");
        }else {
            System.out.println(" Temp. ujemna");
        }

    }
}
