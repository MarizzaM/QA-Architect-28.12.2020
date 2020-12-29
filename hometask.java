package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Random r = new Random();

        int sum = 0;
        float avg;

//        1. input array size from user
//        create int array in the given size
//        populate the array with random numbers
//        sum the array
//        print the average number

        System.out.print("Please enter array size ");
        int size = s.nextInt();

        int [] arr = new int [size];

        for (int i = 0; i < arr.length; i++){
            arr[i] = r.nextInt(20)+1;
        }
        System.out.print("\n" + "Your array: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        avg = sum / size;
        System.out.println("\n" + "Sum: "+ sum);
        System.out.println("Avg: "+ avg);

//        2. create an array of 5 Strings (hint: String[] word = new String[5])
//        create a for loop and input words from the user into the array
//        now print the array in a for loop
        String[] word = new String[5];
        System.out.println("Please enter 5 words");
        for (int i = 0; i < word.length; i++){
            word[i] = s.next();
        }
        for (int i = 0; i < word.length; i++){
            System.out.print(word[i] + " ");
        }
//                *** etgar: print the average length of the words, i.e.  hello java book pro about. the words length is  [5,4,4,3,5] => average=4.2
        System.out.println();
        sum = 0;
        for (int i = 0; i < word.length; i++){
            System.out.print(word[i].length() + " ");
            sum += word[i].length();
        }
        avg = sum/word.length;
        System.out.println("\n"+"Average length of the words: " + avg );
//
//        3. create int array A with random numbers (size of 5)
//        create int array B with random numbers (size of 5)
//        create int array C (size of 5) which each element will be the sum of A+B
//        for exmaple:
//        A [ 5, 8, 6, 2, 3]  -- random
//        B [ 3, 7, 8, 3, 1]  -- random
//        C [ 8,15,14, 5, 4]  -- sum
        int [] A = new int [5];
        for (int i = 0; i < A.length; i++){
            A[i] = r.nextInt(10)+1;
        }
        System.out.print("\nArray A: ");
        for (int i = 0; i < A.length; i++){
            System.out.print(A[i] + " ");
        }
        int [] B = new int [5];
        for (int i = 0; i < B.length; i++){
            B[i] = r.nextInt(10)+1;
        }
        System.out.print("\nArray B: ");
        for (int i = 0; i < B.length; i++){
            System.out.print(B[i] + " ");
        }
        int [] C = new int [5];
        for (int i = 0; i < C.length; i++){
            C[i] = A[i]+B[i];
        }
        System.out.print("\nArray C: ");
        for (int i = 0; i < C.length; i++){
            System.out.print(C[i] + " ");
        }
//                *etgar: create int array D which will contain the larger name from A or B
//                *D[ 5, 8, 8, 3, 3]
        int [] D = new int [5];
        for (int i = 0; i < D.length; i++){
            if (A[i] > B[i]){
                D[i] = A[i];
            } else {
                D[i] = B[i];
            }
        }
        System.out.print("\nArray D: ");
        for (int i = 0; i < D.length; i++){
            System.out.print(D[i] + " ");
        }

//            *etgar: create in array E which will be concat of the array A and B
//            *E[ 5, 8, 6, 2, 3, 3, 7, 8, 3, 1]
        int [] E = new int [A.length + B.length];

        int counter = 0;
        for (int i = 0; i < A.length; i++){
            E[i] = A[i];
            counter++;
        }
        for (int j = 0; j < B.length; j++){
            E[counter++] = B[j];
        }
        System.out.print("\nArray E: ");
        for (int i = 0; i < E.length; i++){
            System.out.print(E[i] + " ");
        }
//        3. ***etgar crazy:
//        input number of classes from user
//        for each size input number of students
//        input all numbers from user
//        calculate the average of each class in an array
//                calculate the average of averages
        System.out.print("\nPlease, enter count of classes: ");

        int count_of_classes = s.nextInt();
        float sum_avg = 0;
        int [] arr_class = new int [count_of_classes];

        for (int i = 0; i < count_of_classes; i++){
            System.out.print(String.format("\nPlease, enter count of pupils from class #%d ", i + 1 ));
            arr_class[i] = s.nextInt();
            int [] pupils = new int [arr_class[i]];
            for (int j = 0; j < pupils.length; j++){
                System.out.print(String.format("\nPlease enter grade #%d: ", j + 1));
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
        System.out.println("\nAverage of averages: " + avg_of_avg);
    }
}

