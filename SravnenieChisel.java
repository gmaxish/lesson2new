package com.MGrigorovich.lemon.lesson2;
/*
Напишите программу, которая определит какое из чисел больше.

@author MGrigorovich
@version 0.01
 */

import java.util.Scanner;

public class SravnenieChisel {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        Scanner sc = new Scanner(System.in);
        int count1 = sc.nextInt();

        System.out.println("Введите второе число: ");
        Scanner sc1 = new Scanner(System.in);
        int count2 = sc.nextInt();

        if (count1 > count2) {
            System.out.println("Первое число " + count1 + " больше второго");
        }else{
                System.out.println("Второе число " + count2 + " больше первого");
            }
        }
    }

