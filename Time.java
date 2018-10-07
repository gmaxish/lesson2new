package com.MGrigorovich.lemon.lesson2;
/*
Напишите программу, которая будет считать количество часов, минут и секунд в n-ном количестве суток.

 @author MGrigorovich
 @version 0.01

 */

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        System.out.println("Укажите количество суток");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        int sec = 86400;
        int min = 1440;
        int hour = 24;

        int dayH = day * hour;
        int dayM = day * min;
        int dayS = day * sec;

        System.out.println("В " + day + " сутках " + dayH + " часов");
        System.out.println("В " + day + " сутках " + dayM + " минут");
        System.out.println("В " + day + " сутках " + dayS + " секунд");

    }
}
