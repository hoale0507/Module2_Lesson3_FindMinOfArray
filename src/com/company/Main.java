package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the size");
        int size = input.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the element at index " + i);
            array[i] = input.nextInt();
        }
        printArray(array);
        int min = array[0];
        int index = 1;
        for (int i = 0; i < array.length; i++) {
            if(min > array[i]){
                min = array[i];
                index = i + 1;
            }
        }
        System.out.println("\nThe min element is " + min + " at index " + index);
    }
    public static void printArray(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}
