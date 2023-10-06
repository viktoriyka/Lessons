package Homeworks.HW3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("Input elementls of array, please");

        for (int i = 0; i < array.length; i++) {
            array [i] = in.nextInt();
        }

        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Max is " + max);

        int min = array[1];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Min is " + min);
    }
}

