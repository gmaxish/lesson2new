package com.MGrigorovich.lemon.lesson2;
/*
Напишите программу, которая будет просить ввести ваше имя, а потом выведет его на консоль.

@author MGrigorovich
@version 0.01
*/
import java.util.Scanner;

public class VivodImeni {
    public static void main(String[] args) {
        System.out.println("Введите Ваше имя: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println(name);
    }
}
