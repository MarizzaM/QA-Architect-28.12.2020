package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Random r = new Random();

        int [] arr = new int [20];
        for (int i = 0; i <= arr.length-1; i++){
            arr[i] = i+1;
        }
        for (int i = arr.length-1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
