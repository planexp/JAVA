package com.kodilla.testing;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        Calculator obiect = new Calculator();

        int result = obiect.add(5,2);
        if (result == 7){
            System.out.println("Test 1  OK");
        } else {
            System.out.println("Error test 1 !");
        }
        int result2 = obiect.subtract(5, 2);
        if (result2 == 7){
            System.out.println("Test 2  OK");
        } else {
            System.out.println("Error test 2 !");

        }

    }
}