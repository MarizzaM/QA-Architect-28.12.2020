package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Random r = new Random();

        int [] arr = new int [10];
        for (int i = 0; i <= arr.length-1; i++){
            arr[i] = r.nextInt(10);
            System.out.print(arr[i] + " ");
        }

    }
}
