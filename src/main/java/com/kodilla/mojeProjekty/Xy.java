package com.kodilla.mojeProjekty;
import java.util.*;

public class Xy {
    public static void main(String[] args) {

        ArrayList<Integer> listOfnumbers = new ArrayList<Integer>(Arrays.asList(2,1,10,7,15,90));

        int min = listOfnumbers.get(0);
        int max = listOfnumbers.get(0);

        int minv2 = listOfnumbers.get(0);
        int maxv2 = listOfnumbers.get(0);

        for(int x: listOfnumbers) {

            if(x < min) {
                min = x;
            }
            if (x > max) {
                max = x;
            }
        }
        int max1 = max;
        int min1 = min;

        for(int x: listOfnumbers) {

            if (x < minv2 && x != min1) {
                minv2 = x;
            }
            if (x > maxv2 && x != max1) {
                maxv2 = x;
            }
        }
        int max2 = maxv2;
        int min2 = minv2;

        System.out.println("Najmniejsza para: " + min1 + ","+ min2);
        System.out.println("Największa para: " + max1 + ","+ max2);
        }
    }