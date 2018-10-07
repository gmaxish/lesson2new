package com.MGrigorovich.lemon.lesson2;
/*
  Пользователь задает расстояние до места назанения (N) и время, за которое нужно проехать (Т).
  Вычислить скорость (км/ч) с которой нужно ехать.

 @author MGrigorovich
 @version 0.01
 */

import java.util.Scanner;


public class Speed {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sp;
        System.out.println("Введите расстояние: " );
        int distance = sc.nextInt();

        System.out.println("Введите время: " );
        int time = sc.nextInt();

        sp = distance/time;

        System.out.println("Скорость составит " + sp +" км/ч");
    }


}
