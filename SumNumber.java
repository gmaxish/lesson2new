package com.MGrigorovich.lemon.lesson2;
/*
В переменной n хранится натуральное двузначное число.
Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.

В переменной n хранится натуральное трёхзначное число.
Создайте программу вычислящую и выводящую на экран сумму цифр числа n.

@author MGrigorovich
@version 0.01
*/


import java.util.Scanner;

public class SumNumber {
    public static void main(String[] args) {
        System.out.print("Введите любое число: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        System.out.println("Сумма цифер числа будет равна: " + sum);
    }

}