package com.kodilla.testing.collection;

import org.junit.*;
import java.util.*;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

import java.util.ArrayList;

public class CollectionTestSuite {

    private static OddNumbersExterminator oddNumber;
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }

    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass(){
        oddNumber = new OddNumbersExterminator();
    }

    @Test
    public void testOddNumbersExterminator(){
        //Given
        ArrayList<Integer> emptyList = new ArrayList<>();
        //When
        List<Integer> result = oddNumber.exterminate(emptyList);
        System.out.println("Testing empty list :" + result);
        //Then
        Assert.assertEquals(emptyList, result);
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        int size = oddNumbersExterminator.checkIfEmpty(new ArrayList<>());
        //Then
        Assert.assertEquals(0,size);
        System.out.println("Testing last " + size);

    }
}

