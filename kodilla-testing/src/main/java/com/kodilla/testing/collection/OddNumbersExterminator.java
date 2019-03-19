package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;


public class OddNumbersExterminator {

    public List<Integer> exterminate(ArrayList<Integer> numbers) {
       List<Integer> oddNumbersList= new ArrayList<>();

        for (int numb : numbers) {
            if (numb%2 ==0) {
                oddNumbersList.add(numb);

            }
        }
        return oddNumbersList;
    }
    public int checkIfEmpty(ArrayList<Integer> numbers) {
        return numbers.size();
    }
}

