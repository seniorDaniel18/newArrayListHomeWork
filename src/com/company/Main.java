package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>();
        ArrayList<Integer> arrayEven = new ArrayList<>();
        ArrayList<Integer> arrayOdd = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 50; i++) {
            array.add(random.nextInt(100));

        }

        for (Integer i : array) {

            if (i % 2 == 0) {
                arrayEven.add(i);
            }

            if (i % 2 != 0) {
                arrayOdd.add(i);
            }
        }
                System.out.println("even" + arrayEven);
                System.out.println("odd" + arrayOdd);


    }
}