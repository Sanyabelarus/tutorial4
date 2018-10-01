package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        sort1();
        randomNum2();
        sum3();
        sumNumber4();
        factNumber5();
    }
    public static void sort1(){                                 // Задание №1
        int[] array = {2, 7, 6, 3, 0, 1, 7, 5,23,645};
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i-1; j+=2) {
                if (array[j] > array[j + 2]) {
                    int temp = array[j];
                    array[j] = array[j + 2];
                    array[j + 2] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + "   ");
        }

    }
    public static void randomNum2(){                            // Задание №2
        int[] numbers = {4,56,234,264,234,423};
        int temp = numbers[0];
        for(int i=0;i<numbers.length;i++){
            if(temp<numbers[i]){
                temp=numbers[i];
            }
        }
        System.out.println(temp + " is greater number of array");
    }
    public static void sum3(){                                  // Задание №3
        int sum=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int num = scanner.nextInt();
        while(num != 0){
            sum += (num % 10);
            num/=10;
        }
        System.out.println(sum + " ");
    }
    public static void sumNumber4(){                            //Задание №4
        int number = 154;
        int sum=0;
        for(int i = 0;i<number;i++){
            sum += i;
        }
        System.out.println("Сумма числа " + number+ " равна: " + sum);
    }
    public static void factNumber5(){                           //Задание №5
        long number = 34L;
        long sum = 1L;
        for(int i =1;i<number;i++){
            sum *= i;
        }
        System.out.println("Факториал числа " + number+ " равна: " + sum);
    }
}
