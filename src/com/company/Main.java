package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> array50 = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 50; i++) {
            array50.add(random.nextInt(100));
        }

        System.out.print("[");
        for (int i : array50) {
            System.out.print(i + " ");
        }
        System.out.println("]");

        System.out.println("------------------------------");


        ArrayList<Integer> evenNumbers = new ArrayList<>();

        evenNumbers.add(2);
        evenNumbers.add(44);
        evenNumbers.add(88);
        evenNumbers.add(100);
        evenNumbers.add(46);
        evenNumbers.add(82);
        evenNumbers.add(28);
        evenNumbers.add(98);
        evenNumbers.add(12);

        System.out.println(evenNumbers);

        System.out.println("------------------------------");

        ArrayList<Integer> oddNumbers = new ArrayList<>();

        oddNumbers.add(99);
        oddNumbers.add(65);
        oddNumbers.add(37);
        oddNumbers.add(97);
        oddNumbers.add(13);
        oddNumbers.add(61);
        oddNumbers.add(93);
        oddNumbers.add(73);
        oddNumbers.add(91);

        System.out.println(oddNumbers);
    }
}