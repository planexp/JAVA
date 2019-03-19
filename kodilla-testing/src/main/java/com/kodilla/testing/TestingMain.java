package com.kodilla.testing;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        Calculator obiect = new Calculator();

        int result2 = obiect.subtract(5, 2);
        if (result2 == 7){
            System.out.println("Test2  OK");
        } else {
            System.out.println("Error test2 !");
        }
        int result = obiect.add(5,2);
        if (result == 7){
            System.out.println("Test1  OK");
        } else {
            System.out.println("Error test1 !");






        }

    }
}