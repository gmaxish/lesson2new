package com.MGrigorovich.lemon.lesson2;
/*
Разработайте программу, которая будет выводить таблицу умножения введенного пользователем числа с клавиатуры.

@author MGrigorovich
@version 0.01
*/

import java.util.Scanner;

public class TablUmnoj {
    public static void main(String[] args) {
        System.out.println("Введите любое число: ");
        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();

        for (int i = 1; i <= 10; i++) {

            System.out.println(numb + "*" + i + " = " + numb * i );
        }
    }

}
