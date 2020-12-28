package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//1
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        System.out.print("Please enter number ");
        int size = s.nextInt();

        int [] arr = new int [size];

        for (int i = 0; i < arr.length; i++){
            arr[i] = r.nextInt(20)+1;
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        float avg = sum / size;
        System.out.println("\n" + "Sum: "+ sum);
        System.out.println("\n" + "Avg: "+ avg);
//        2
        System.out.print("Please, enter count of classes: ");

        int count_of_classes = s.nextInt();
        float sum_avg = 0;
        int [] arr_class = new int [count_of_classes];

        for (int i = 0; i < count_of_classes; i++){
            System.out.print(String.format("\n" + "Please, enter count of pupils from class #%d ", i + 1 ));
            arr_class[i] = s.nextInt();
            int [] pupils = new int [arr_class[i]];
            for (int j = 0; j < pupils.length; j++){
                System.out.print(String.format("\n" + "Please enter grade #%d: ", j + 1));
                pupils[j] = s.nextInt();
            }
            sum = 0;
            for (int j = 0; j < pupils.length; j++){
                sum += pupils[j];
            }
            float average  = sum / pupils.length;
            System.out.print(String.format("Average of %d class: #%f ", i + 1 , average ));
            sum_avg += average;
        }
        float avg_of_avg = sum_avg/count_of_classes;
        System.out.println("\n" + "Average of averages: " + avg_of_avg);
    }
}
