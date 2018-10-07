package com.MGrigorovich.lemon.lesson2;
/*
Напишите программу, которая будет проверять является ли число типа double целым.

@author MGrigorovich
@version 0.01
 */

        import java.util.Scanner;

public class CheckDouble {
    public static void main(String[] args) {

        System.out.println("Введите число");
        Scanner scan=new Scanner(System.in);
        double numb= scan.nextDouble();

        System.out.print(numb);
        if (numb%2==0){
            System.out.println(" - Целое");
        }else{
            System.out.println(" - Не целое");
        }

    }

}
