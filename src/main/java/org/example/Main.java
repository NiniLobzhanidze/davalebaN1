package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int count = 0;

        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("მასივში არ არის ლუწი რიცხვი");
        } else {
            System.out.println("მასივში არის " +  count  + " ლუწი რიცხვი");
        }
    }
}

